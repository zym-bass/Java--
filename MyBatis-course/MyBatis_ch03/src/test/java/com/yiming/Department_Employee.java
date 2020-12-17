package com.yiming;

import com.yiming.entity.Department;
import com.yiming.entity.Employee;
import com.yiming.mapper.DepartmentMapper;
import com.yiming.mapper.EmployeeMapper;
import com.yiming.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Department_Employee {
    //通过员工id获取员工信息并且获取部门信息
    @Test
    public void  getEmployeeById(){

        try(        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        ){
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = mapper.getEmployeeById(1);
            System.out.println(employee);
        }
    }
    //通过部门id获取部门内的员工信息
    @Test
    public  void getEmployeeByIds(){
        try(
                SqlSession sqlSession = MyBatisUtils.getSqlSession();
                ){
            DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
            Department department = mapper.getDepartmentByIds(1);
            department.getEmployees().forEach((Employee e)->{
                System.out.println(e);
            });
        }
    }
}
