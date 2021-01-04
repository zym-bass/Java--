import org.junit.Test;
import redis.clients.jedis.Jedis;

public class RedisTest {

    @Test
    public void testAddString(){
        Jedis jedis = new Jedis("192.168.230.201",6379);
        jedis.set("name","zhangsan");
        jedis.close();

    }
}
