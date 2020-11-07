import java.util.function.Consumer;

/*需求 : 定义出一个方法功能, 客户消费指定金额, 这些金额都如何消费的
	客户1 : 花了500元, 买了一把大宝剑
	客户2 : 花了400元, 买了一双球鞋
	客户3 : 花了888元, 买了一套护肤品
	... 还有很多很多的客户, 对于指定金额有不同的消费

	*
	*  分析 :
	*    1) 需要知道客户消费金额, double money
	*    2) 需要知道客户对于money怎么消费, 于是可以将Cunsumer接口作为方法参数传递,相当于传递accept(Double money)
	*/


public class ConsumerTest01 {
    public static void main(String[] args) {
        Consumer<Double> s = (x)-> System.out.println("花了"+x+"买了一个来来来");
        consumerTest(123,s);
        s.accept(123.12);
    }
    public static void consumerTest(double sping , Consumer<Double> sumer){
        sumer.accept(sping);
    }
    public int maxProfit(int[] prices) {
        int length = prices.length;
        if(length<2){
            return 0;
        }

        int [][] p = new int [length][2];
        p[0][0] = 0;
        p[0][1] = -prices[0];
        int earning =0 ;
        for(int i =1; i <length ; i++){
            p[i][0]  = Math.max(p[i-1][0] ,p[i-1][1] + prices[i]);
            p[i][1]  = Math.max(p[i-1][1] ,p[i-1][0] - prices[i] );
        }
        return p[length-1][0];
    }
}
class Consumer01 implements Consumer<String> {
    @Override
    public void accept(String x) {
        System.out.println(x);
    }
}
