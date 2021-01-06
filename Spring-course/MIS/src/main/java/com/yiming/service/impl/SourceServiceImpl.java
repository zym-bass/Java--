package com.yiming.service.impl;

import com.yiming.entity.Sources;
import com.yiming.entity.SourcesExample;
import com.yiming.mapper.SourcesMapper;
import com.yiming.service.Role_Source;
import com.yiming.service.SourcesService;
import com.yiming.utils.OAResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class SourceServiceImpl implements SourcesService {

    @Autowired
    private SourcesMapper sourcesMapper;

    @Override
    public List<Sources> getRootSources(Integer pid) {
        SourcesExample sourcesExample = new SourcesExample();
        SourcesExample.Criteria criteria = sourcesExample.createCriteria();
        criteria.andPidEqualTo(pid);
        List<Sources> list = sourcesMapper.selectByExample(sourcesExample);
        if (list!=null ){
            for (Sources sources: list){
                sources.setChildren(getRootSources(sources.getId()));
            }
        }
        return list;
    }

    //查询所有父类id
    public Set<Integer> getAllPid() {
        List<Sources> list = sourcesMapper.selectByExample(new SourcesExample());
        Set<Integer> pid = new HashSet<>();
        for (Sources sources1 : list){
            pid.add(sources1.getPid());
        }
        pid.remove(0);
        return pid;
    }

    //得到父类对象
    @Override
    public List<Sources> getParentNodes(List<Sources> sources) {
        Set<Integer> allPid = getAllPid();
        for (Integer id : allPid){
            sources.add(sourcesMapper.selectByPrimaryKey(id));
        }

        return sources;
    }

    @Override
    public OAResult addSources(Sources sources) {

        if (sourcesMapper.insert(sources)==1) {
            return OAResult.ok(200,"添加成功");
        }
        return OAResult.ok(400,"添加失败");
    }

    @Override
    public OAResult deleteSources(Integer id) {
        if(sourcesMapper.deleteByPrimaryKey(id)==1){
            return OAResult.ok(200,"删除成功");
        }

        return OAResult.ok(400,"删除失败");
    }

    @Override
    public Sources getParentNodeById(Integer id) {
        return sourcesMapper.selectByPrimaryKey(id);
    }

    @Override
    public OAResult updateSource(Sources sources) {
        if(sourcesMapper.updateByPrimaryKey(sources)==1){
            return OAResult.ok(200,"修改成功");
        }
        return OAResult.ok(400,"修改失败");
    }
}
