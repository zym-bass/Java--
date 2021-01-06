package com.yiming.service;

import com.yiming.entity.Role;
import com.yiming.utils.OAResult;

public interface RoleService {

    OAResult addRole(Role role, int[] ids);
}
