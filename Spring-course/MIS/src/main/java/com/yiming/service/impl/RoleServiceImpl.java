package com.yiming.service.impl;

import com.yiming.entity.Role;
import com.yiming.entity.RoleSources;
import com.yiming.mapper.RoleMapper;
import com.yiming.mapper.RoleSourcesMapper;
import com.yiming.service.RoleService;
import com.yiming.utils.OAResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RoleSourcesMapper roleSourcesMapper;

    @Override
    public OAResult addRole(Role role, int[] ids) {


        Integer rows = roleMapper.insert(role);
        int count=0;
        if (ids!=null){
            for (Integer id : ids){
                RoleSources roleSources = new RoleSources();
                roleSources.setResourcesFk(id);
                roleSources.setRoleFk(role.getRoleid());
                roleSourcesMapper.insertSelective(roleSources);
                count++;
            }
            if (rows==1 && count==ids.length){
                return OAResult.ok(200,"添加成功");
            }
        }
        return OAResult.ok(400,"添加失败");
    }
}
