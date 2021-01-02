package com.yiming.service.impl;

import com.yiming.dao.DeptDao;
import com.yiming.domain.Dept;
import com.yiming.service.DeptService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DeptServiceImp  implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public void addDept(Dept dept) {
        deptDao.insertDept(dept);
    }

    @Override
    public Dept getDeptById(Integer deptno) {
        return deptDao.getDeptById(deptno);
    }


}
