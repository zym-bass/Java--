/*/计算1到n的求和/*/

public class RecusionTest02 {
    public static void main(String[] args){
        System.out.println(sum(100));
        System.out.println(sum01(100));
        System.out.println(sum02(100,0));
        System.out.println(sum03(100));
    }
    //计算1到n的和
    public static int sum(int n){
        int nums=0;
        for(int i = 1 ; i<=n ; i++){
            nums+=i;
        }
        return nums;
    }
    //(100+1)*(100/2)
    public static int sum01(int n ){
        if(n%2==1){
            return (n*((n-1)/2)+n);
        }

        return (n+1)*(n/2);
    }
    //方法递归（1）
    public static int sum02(int n,int nums){
        if(n==0){
            return nums;
        }
        nums+=n;
        n--;
        nums = sum02(n,nums);
        return nums;
        /*if(n==0){

            return nums;
        }
        nums+=n;
        n--;
        System.out.println("n:"+n);
        System.out.println("nums:"+nums);
        sum02(n,nums);//最后一次nums 确实是5500 但是没有返回值 返回到第一次执行的时候num还是100
        System.out.println("nums:"+nums);
        return nums;//100.......5500 .......100*/
    }
    //方法递归（2）
    public static  int sum03(int n ){
        if(n==1){
            return 1;
        }
        return n+sum03(n-1);

    }
}
