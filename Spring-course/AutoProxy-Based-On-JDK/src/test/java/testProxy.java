import com.yiming.Factory.ProxyFactory;
import com.yiming.dao.PersonDao;
import com.yiming.dao.impl.PersonDaoImpl;
import org.junit.Test;

public class testProxy {
    @Test
    public  void testProxy(){
        //产生目标类的对象
        PersonDao personDao = new PersonDaoImpl();
        //代理类对象
        PersonDao personDao2=(PersonDao)new ProxyFactory().creatProxyInstance(personDao);
        personDao2.getPersonById(234);

    }
}
