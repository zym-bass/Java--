import java.util.HashMap;

public class HashMapTest01 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Jack");
        System.out.println(hashMap.get(1));
        hashMap.put(1,"Jackdd");
        System.out.println(hashMap.put(1,"Jackd"));
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.put(12,"Jackd"));
    }
}
