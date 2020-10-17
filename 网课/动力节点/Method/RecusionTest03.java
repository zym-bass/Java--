public class RecusionTest03 {
    public static void main(String[] args){
        System.out.println(multiply01(5));
    }
    public static int multiply01(int n){
        if(n==1){
            return 1;
        }
        return n*multiply01(n-1);
    }
}
