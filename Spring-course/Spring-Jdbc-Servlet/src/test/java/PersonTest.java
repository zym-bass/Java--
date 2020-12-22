import com.yiming.dao.PersonDao;
import com.yiming.entity.Person;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class PersonTest {
    private ApplicationContext ctx ;

    @Before
    public void testBefore(){
        ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    //保存数据
    @Test
    public void  savePerson(){
        PersonDao personDao =(PersonDao)ctx.getBean("personDaoImpl");
        personDao.savePerson(new Person("咋咋会","男",12,new Date()));
    }

    //修改数据
    @Test
    public void updatePerson(){
        PersonDao personDao =(PersonDao)ctx.getBean("personDaoImpl");
        personDao.updatePerson(new Person(12,"咋咋会","男",12,new Date()));
        System.out.println("修改成功");
    }

    //删除数据
    @Test
    public void deletePerson(){
        PersonDao personDao =(PersonDao)ctx.getBean("personDaoImpl");
        personDao.deletePerson(12);

    }

    //根据id查询数据
    @Test
    public void getPersonById(){
        PersonDao personDao =(PersonDao)ctx.getBean("personDaoImpl");
        Person person = personDao.getPersonById(12);
        System.out.println(person);

    }

    //根据id查询数据
    @Test
    public void getPersons(){
        PersonDao personDao =(PersonDao)ctx.getBean("personDaoImpl");
        personDao.getPersons().forEach((Person  person)->System.out.println(person));
    }
}
