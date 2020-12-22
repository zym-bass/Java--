import com.yiming.dao.PersonMapper;
import com.yiming.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

    @Test
    public void testGetPersons(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonMapper personMapper =(PersonMapper) applicationContext.getBean("personMapper");
        personMapper.getPersons().forEach((Person p)-> System.out.println(p));
    }
}
