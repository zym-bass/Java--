package com.yiming;

import com.yiming.entity.Department;
import com.yiming.entity.Employee;
import com.yiming.mapper.DepartmentMapper;
import com.yiming.mapper.EmployeeMapper;
import com.yiming.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeTest {

    //通过部门id获取部门内的员工信息
    @Test
    public  void getEmployeeByIds(){
        try(
                SqlSession sqlSession = MyBatisUtils.getSqlSession();
        ) {
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            mapper.getEmployeesByDid(1).forEach((Employee e) -> {
                System.out.println(e);
            });
        }
    }
    //根据姓名和大于编号的查询信息
    @Test
    public  void getEmployeesByNameAge(){
        try(
                SqlSession sqlSession = MyBatisUtils.getSqlSession();
        ) {
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            Map<String ,Object> map = new HashMap<>();
            map.put("name","雷鸣");
            map.put("id",3);
            mapper.getEmployeesByNameAge(map).forEach((Employee e) -> {
                System.out.println(e);
            });
        }
    }

    //修改员工信息
    @Test
    public void updateEmployee(){
        try(
                SqlSession sqlSession =MyBatisUtils.getSqlSession()
        ){
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            mapper.updateEmployee(new Employee(1,"赵名","男"));
            sqlSession.commit();
        }
    }

    //模糊查询员工信息
    @Test
    public void selectEmployeeLike(){
        try(
                SqlSession sqlSession =MyBatisUtils.getSqlSession()
        ){
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = new Employee();
            employee.setName("赵");
            List<Employee> list = mapper.selectEmployeeLike(employee);
            list.forEach(e->System.out.println(e));
        }
    }

}
