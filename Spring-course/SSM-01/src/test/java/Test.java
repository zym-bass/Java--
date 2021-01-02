import com.yiming.entity.Customer;
import com.yiming.service.impl.CustomerServiceImpl;
import com.yiming.utils.PageView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {

    @org.junit.Test
    public  void ifej(){
        ApplicationContext ca  = new ClassPathXmlApplicationContext("spring/application-mybatis.xml");
        CustomerServiceImpl customerServiceImpl = ca.getBean("customerServiceImpl",CustomerServiceImpl.class);
        List<Customer> records = customerServiceImpl.getCustomers(1, 5, 0, "", 0).getRecords();
        for (Customer c : records){
            System.out.println(c);
        }
    }
}
