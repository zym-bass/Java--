package com.yiming;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.yiming.entity.Department;
import com.yiming.entity.DepartmentExample;
import com.yiming.entity.Employee;
import com.yiming.entity.EmployeeExample;
import com.yiming.mapper.DepartmentMapper;
import com.yiming.mapper.EmployeeMapper;
import com.yiming.utils.MyBatisUtils;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class EmployeeTest {
    //添加信息
    @Test
    public void testEmployeeAdd(){
        try(SqlSession sqlSession = MyBatisUtils.getSqlSession()){
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = new Employee();
            employee.seteName("田高利");
            employee.seteGender("男");
            employee.seteDepartId(1);
            employeeMapper.insert(employee);
            sqlSession.commit();
        }
    }
    //根据主键修改信息
    @Test
    public void testEmployeeByIdUpdate(){
        try(SqlSession sqlSession  = MyBatisUtils.getSqlSession()){
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = new Employee();
            employee.seteId(9);
            employee.seteName("田高利田高利");
            employee.seteGender("男");
            employee.seteDepartId(2);
            employeeMapper.updateByPrimaryKey(employee);
            sqlSession.commit();
           // employeeMapper.updateByExample()
        }
    }

    //根据特定信息修改信息
    @Test
    public void testEmployeeOtherUpdate(){
        try(SqlSession sqlSession  = MyBatisUtils.getSqlSession()){
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = new Employee();
            //employee.seteId(9);
            employee.seteName("田高利");
            employee.seteGender("男");
            employee.seteDepartId(2);
            EmployeeExample employeeExample = new EmployeeExample();
            EmployeeExample.Criteria criteria = employeeExample.createCriteria();
            criteria.andENameEqualTo("田高利田高利");
            employeeMapper.updateByExampleSelective(employee,employeeExample);
            sqlSession.commit();

        }
    }

    //根据主键删除信息
    @Test
    public void testEmployeeByIdDelete(){
        try(SqlSession sqlSession  = MyBatisUtils.getSqlSession()){
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = new Employee();
            employeeMapper.deleteByPrimaryKey(9);
            sqlSession.commit();

        }
    }

    //根据特定信息删除信息
    @Test
    public void testEmployeeByOtherDelete(){
        try(SqlSession sqlSession  = MyBatisUtils.getSqlSession()){
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            EmployeeExample employeeExample = new EmployeeExample();
            EmployeeExample.Criteria criteria = employeeExample.createCriteria();
            criteria.andEDepartIdEqualTo(3);
            criteria.andEGenderEqualTo("女");
            employeeMapper.deleteByExample(employeeExample);
            sqlSession.commit();

        }
    }
    //查询信息
    @Test
    public void testEmployeeSelect(){
        try(SqlSession sqlSession =MyBatisUtils.getSqlSession()){
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            EmployeeExample employeeExample = new EmployeeExample();
            EmployeeExample.Criteria criteria = employeeExample.createCriteria();
            criteria.andEDepartIdBetween(1,4);
            employeeMapper.selectByExample(employeeExample).forEach( (Employee e) ->
                System.out.println(e));
        }
    }
    //多表查询
    @Test
    public void testEmployeeSelective(){
        try(SqlSession sqlSession =MyBatisUtils.getSqlSession()){
            DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
            DepartmentExample departmentExample = new DepartmentExample();
            DepartmentExample.Criteria departmentExampleCriteria = departmentExample.createCriteria();
            departmentExampleCriteria.andDNameEqualTo("后勤部");
            departmentMapper.selectByExample(departmentExample).forEach((Department department)->{
                EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
                EmployeeExample employeeExample = new EmployeeExample();
                EmployeeExample.Criteria criteria = employeeExample.createCriteria();
                criteria.andEDepartIdEqualTo(department.getdId());
                employeeExample.setOrderByClause("e_id desc ");
                employeeMapper.selectByExample(employeeExample).forEach( (Employee e) ->
                        System.out.println(e));
            });

        }
    }

    //分页查询
    @Test
    public void testEmployeePageHelper(){
        try(SqlSession sqlSession =MyBatisUtils.getSqlSession()){
            //1. 设置PageHelper
            PageHelper.startPage(1,3);


            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            EmployeeExample employeeExample = new EmployeeExample();
            employeeExample.setOrderByClause("e_id desc ");


            //创建PageInfo
            PageInfo<Employee> employeePageInfo = new PageInfo<>(employeeMapper.selectByExample(employeeExample));
            employeePageInfo.getList().forEach((Employee e)->{
                System.out.println(e);
            });

        }
    }
    @Test
    public void doSome(){
        List<String> list = new ArrayList<>(Arrays.asList(null,"2","3","4"));
        list.removeIf(String::isEmpty);

        System.out.println(list.get(0));

    }

    /*//分页查询
    @Test
    public void testEmployeePage(){
        try(SqlSession sqlSession =MyBatisUtils.getSqlSession()){
            Cursor<Employee> cursor =sqlSession.getMapper(EmployeeMapper.class).

        }
    }*/

}
