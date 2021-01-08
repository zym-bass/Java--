package com.yiming.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yiming.entity.Dept;
import com.yiming.entity.DeptExample;
import com.yiming.mapper.DeptMapper;
import com.yiming.service.DeptService;
import com.yiming.utils.LayuiTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptMapper deptMapper;

    @Override
    public LayuiTable<Dept> getAllDepts(int page, int limit) {
        PageHelper.startPage(page,limit);
        List<Dept> depts = deptMapper.selectByExample(new DeptExample());
        PageInfo<Dept> pageInfo = new PageInfo<>(depts);
        LayuiTable<Dept> layuiTable = new LayuiTable<>(0,"", pageInfo.getTotal(), pageInfo.getList());
        return layuiTable;
    }
}
