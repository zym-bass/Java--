package com.yiming.service.impl;

import com.yiming.entity.RoleSourcesExample;
import com.yiming.mapper.RoleSourcesMapper;
import com.yiming.service.Role_Source;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Role_SourceImpl implements Role_Source {
    @Autowired
    private RoleSourcesMapper roleSourcesMapper;

    @Override
    public void isRole_SourceBySid(Integer sid) {
        RoleSourcesExample roleSourcesExample = new RoleSourcesExample();
        RoleSourcesExample.Criteria criteria = roleSourcesExample.createCriteria();
        criteria.andResourcesFkEqualTo(sid);
        roleSourcesMapper.deleteByExample(roleSourcesExample);
        return;
    }
}
