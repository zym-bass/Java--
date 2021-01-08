package com.yiming.service;

import com.yiming.entity.Dept;
import com.yiming.utils.LayuiTable;

public interface DeptService {


    LayuiTable<Dept> getAllDepts(int page, int limit);
}
