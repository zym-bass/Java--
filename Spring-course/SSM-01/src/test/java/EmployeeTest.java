import com.yiming.entity.Employee;
import com.yiming.entity.EmployeeExample;
import com.yiming.entity.Project;
import com.yiming.mapper.EmployeeMapper;
import com.yiming.service.EmployeeService;
import com.yiming.service.ProjectService;
import com.yiming.service.impl.EmployeeServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/application-*.xml")
public class EmployeeTest {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ProjectService projectService;

    @Test
    public void testGetEmployeeById(){
        Employee employee= employeeMapper.selectByPrimaryKey(1);
        System.out.println(employee.getEname());
    }
    @Test
    public void testGetEmployees(){
        employeeService.getEmployees().forEach((Employee e)->{
            System.out.println(e);
        });

    }


    @Test
    public void testGetprojectService(){
        projectService.getProjects().forEach((Project e)->{
            System.out.println(e);
        });

    }
}
