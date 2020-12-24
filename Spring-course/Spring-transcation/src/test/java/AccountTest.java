import com.yiming.entity.Account;
import com.yiming.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AccountTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testAccount(){
        Account account1=new Account(1,"一",100);
        int a=0/0;
        Account account2=new Account(2,"二",400);
        accountService.transfer(account1,account2);
    }
}
