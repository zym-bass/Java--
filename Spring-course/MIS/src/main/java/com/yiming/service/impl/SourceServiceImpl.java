package com.yiming.service.impl;

import com.yiming.entity.Sources;
import com.yiming.entity.SourcesExample;
import com.yiming.mapper.SourcesMapper;
import com.yiming.service.SourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
