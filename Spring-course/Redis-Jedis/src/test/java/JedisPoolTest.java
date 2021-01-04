import com.yiming.Person;
import com.yiming.utils.JsonUtils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-redis.xml")
public class JedisPoolTest {

    @Autowired
    private JedisPool jedisPool;

    @Test
    public void testSelcetJsonString(){
        Jedis jedis = jedisPool.getResource();
        String person1JSON = jedis.get("person1");
        Person person1 = JsonUtils.jsonToEntity(person1JSON,Person.class);
        System.out.println(person1);
        jedis.close();
    }
}
