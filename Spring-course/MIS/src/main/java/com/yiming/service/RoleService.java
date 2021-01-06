package com.yiming.service;

import com.yiming.entity.Role;
import com.yiming.utils.LayuiTable;
import com.yiming.utils.OAResult;

import java.util.Map;

public interface RoleService {

    OAResult addRole(Role role, int[] ids);

    LayuiTable<Role> getAllRoles(int page ,int limit);

    OAResult deleteRole(Integer roleid);

    Map<String, Object> getRoleById(Integer roleid);

    OAResult updateRole(Role role, Integer[] sourecesIds);
}
