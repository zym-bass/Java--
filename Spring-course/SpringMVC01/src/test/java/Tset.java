import org.junit.Test;

public class Tset {
    @Test
    public void doSOne(){
        int i = 1;
        i=insert(i);
        System.out.println(i);
    }
    public int insert(int i){
        i=i+1;
        return i;
    }
}
