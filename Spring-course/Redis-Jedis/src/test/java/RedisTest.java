import com.yiming.Person;
import com.yiming.utils.JsonUtils;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.Date;

public class RedisTest {

    @Test
    public void testAddString(){
        Jedis jedis = new Jedis("192.168.230.201",6379);
        jedis.set("name","zhangsan");
        jedis.close();

    }



    @Test
    public void testSelectString(){
        Jedis jedis = new Jedis("192.168.230.201",6379);
        String name = jedis.get("name");
        System.out.println(name);
        jedis.close();

    }

    @Test
    public void testAddJsonString(){
        Jedis jedis = new Jedis("192.168.230.201",6379);
        Person person = new Person(100,"张三","男",34,new Date());
        jedis.set("person1",JsonUtils.objectToJson(person));
        jedis.close();
    }
}
