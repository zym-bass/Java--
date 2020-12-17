package com.yiming;

import com.yiming.entity.Department;
import com.yiming.entity.Employee;
import com.yiming.mapper.DepartmentMapper;
import com.yiming.mapper.EmployeeMapper;
import com.yiming.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

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
}
