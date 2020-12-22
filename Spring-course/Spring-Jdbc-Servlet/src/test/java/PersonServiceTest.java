import com.yiming.dao.PersonDao;
import com.yiming.entity.Person;
import com.yiming.service.PersonService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PersonServiceTest {
    private ApplicationContext ctx ;

    @Before
    public void testBefore(){
        ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void getPersons(){
        PersonService personService = (PersonService) ctx.getBean("personService");
        personService.getPersons().forEach((Person p)->{
            System.out.println(p);
        } );
    }
}
