package com.yiming.utils;


import com.yiming.entity.Employee;

public class EmployeeVo extends Employee {

    private String  roleName;
    private String deptName;

    public EmployeeVo(Employee employee){
        this.setEid(employee.getEid());
        this.setEname(employee.getEname());
        this.setEsex(employee.getEsex());
        this.setEage(employee.getEage());
        this.setTelephone(employee.getTelephone());
        this.setHiredate(employee.getHiredate());
        this.setPnum(employee.getPnum());
        this.setUsername(employee.getUsername());
        this.setPassword(employee.getPassword());
        this.setPic(employee.getPic());
        this.setRemark(employee.getRemark());
        this.setDfk(employee.getDfk());

    }
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}
