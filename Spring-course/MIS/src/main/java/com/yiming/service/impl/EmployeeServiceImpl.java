package com.yiming.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yiming.entity.*;
import com.yiming.mapper.DeptMapper;
import com.yiming.mapper.EmpRoleMapper;
import com.yiming.mapper.EmployeeMapper;
import com.yiming.mapper.RoleMapper;
import com.yiming.service.EmployeeService;
import com.yiming.utils.EmployeeVo;
import com.yiming.utils.LayuiTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    EmpRoleMapper empRoleMapper;
    @Autowired
    RoleMapper roleMapper;
    @Autowired
    DeptMapper deptMapper;


    @Override
    public List<Employee> getAllDepts() {
        return employeeMapper.selectByExample(new EmployeeExample());
    }

    public LayuiTable<EmployeeVo> getEmployee(Integer page ,Integer limit){
        PageHelper.startPage(page,limit);
        EmployeeExample employeeExample=new EmployeeExample();

        List<Employee> employeeList = employeeMapper.selectByExample(employeeExample);
        PageInfo<Employee> pageInfo=new PageInfo<>(employeeList);
        LayuiTable<EmployeeVo> layuiTable=new LayuiTable<>();
        layuiTable.setCode(0);
        layuiTable.setMsg("");
        layuiTable.setCount(pageInfo.getTotal());
        List<EmployeeVo> employeeVoList=new ArrayList<EmployeeVo>();
        for (Employee employee : pageInfo.getList()) {
            EmployeeVo employeeVo=new EmployeeVo(employee);
            EmpRoleExample empRoleExample=new EmpRoleExample();
            EmpRoleExample.Criteria empRoleExampleCriteria = empRoleExample.createCriteria();
            empRoleExampleCriteria.andEmpFkEqualTo(employee.getEid());
            List<EmpRole> empRoleList = empRoleMapper.selectByExample(empRoleExample);
            if(empRoleList!=null&& empRoleList.size()>0){
                int roleid= empRoleList.get(0).getRoleFk();
                Role role = roleMapper.selectByPrimaryKey(roleid);
                employeeVo.setRoleName(role.getRolename());
            }
            Dept dept= deptMapper.selectByPrimaryKey(employee.getDfk());
            employeeVo.setDeptName(dept.getDname());
            employeeVoList.add(employeeVo);
        }
        layuiTable.setData(employeeVoList);
        return layuiTable;
    }

}
