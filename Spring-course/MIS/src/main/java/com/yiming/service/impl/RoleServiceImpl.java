package com.yiming.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yiming.entity.*;
import com.yiming.mapper.EmpRoleMapper;
import com.yiming.mapper.RoleMapper;
import com.yiming.mapper.RoleSourcesMapper;
import com.yiming.service.RoleService;
import com.yiming.utils.LayuiTable;
import com.yiming.utils.OAResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RoleSourcesMapper roleSourcesMapper;
    @Autowired
    private EmpRoleMapper empRoleMapper;

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

    @Override
    public LayuiTable<Role> getAllRoles(int page ,int limit) {
        PageHelper.startPage(page,limit);
        PageInfo<Role> rolePageInfo = new PageInfo<>(roleMapper.selectByExample(new RoleExample()));
        return new LayuiTable<Role>(0,"", rolePageInfo.getTotal(),rolePageInfo.getList());
    }

    @Override
    public OAResult deleteRole(Integer roleid) {
        EmpRoleExample empRoleExample = new EmpRoleExample();
        EmpRoleExample.Criteria criteria = empRoleExample.createCriteria();
        criteria.andRoleFkEqualTo(roleid);
        empRoleMapper.deleteByExample(empRoleExample);

        RoleSourcesExample roleSourcesExample = new RoleSourcesExample();
        RoleSourcesExample.Criteria criteria1 = roleSourcesExample.createCriteria();
        criteria1.andRoleFkEqualTo(roleid);
        roleSourcesMapper.deleteByExample(roleSourcesExample);

        if (roleMapper.deleteByPrimaryKey(roleid)==1) {
            return OAResult.ok(200,"删除成功");
        }
        return OAResult.ok(400,"删除失败");
    }

    @Override
    public Map<String, Object> getRoleById(Integer roleid) {
        RoleSourcesExample roleSourcesExample = new RoleSourcesExample();
        RoleSourcesExample.Criteria criteria = roleSourcesExample.createCriteria();
        criteria.andRoleFkEqualTo(roleid);
        List<RoleSources> roleSources = roleSourcesMapper.selectByExample(roleSourcesExample);
        System.out.println(roleSources);
        Map<String,Object> map = new HashMap<>();
        map.put("role",roleMapper.selectByPrimaryKey(roleid));
        map.put("roleSourcesList",roleSources);
        return map;
    }

    @Override
    public OAResult updateRole(Role role, Integer[] sourecesIds) {
        roleMapper.updateByPrimaryKey(role);

        RoleSourcesExample roleSourcesExample = new RoleSourcesExample();
        RoleSourcesExample.Criteria criteria = roleSourcesExample.createCriteria();
        criteria.andRoleFkEqualTo(role.getRoleid());
        roleSourcesMapper.deleteByExample(roleSourcesExample);
        int rows = 0;
        for (Integer sourecesId: sourecesIds) {
            roleSourcesMapper.insertSelective(new RoleSources(sourecesId,role.getRoleid()));
            rows++;
        }
        if (rows==sourecesIds.length){
            return OAResult.ok(200,"更新成功");
        }
        return OAResult.ok(400,"更新失败");
    }
}
