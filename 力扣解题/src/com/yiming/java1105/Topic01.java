package com.yiming.java1105;


public class Topic01 {

    //贪心算法
    public int maxProfit01(int[] prices) {
        int len = prices.length;
        if (len < 2) {
            return 0;
        }

        int res = 0;
        for (int i = 1; i < len; i++) {
            res += Math.max(prices[i] - prices[i - 1], 0);
        }
        return res;
    }
    //动态解法
    public int maxProfit(int[] prices) {

        //得到股票日期的长度
        int length = prices.length;
        //当时数组长度小于2 即长度为0或1
        if(length<2){
            return 0;
        }
        /*//创建二维数组 x表示天数 y表示是否持有股票后的余额
        int [][] p = new int [length][2];
        //没有持有股票 当前没钱
        p[0][0] = 0;
        //持有股票 ，当前余额为负的股票价值
        p[0][1] = -prices[0];


        for(int i =1; i <length ; i++){
            //没有持有股票
            p[i][0]  = Math.max(p[i-1][0] ,p[i-1][1] + prices[i]);
            //持有股票
            p[i][1]  = Math.max(p[i-1][1] ,p[i-1][0] - prices[i] );
        }
        return p[length-1][0];*/

        int cash = 0 ;
        int hole = -prices[0];

        int preCash = cash;
        int preHole = hole;
        for(int i = 1  ; i<length ; i++){
            cash = Math.max( preCash , preHole+prices[i] );
            hole = Math.max( preHole , preCash-prices[i]);

            preCash = cash;
            preHole = hole;

        }
        return cash;
    }


}
//力扣122
/*给定一个数组，它的第i 个元素是一支给定股票第 i 天的价格。

        设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。

        注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。



        示例 1:

        输入: [7,1,5,3,6,4]
        输出: 7
        解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
            随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。
        示例 2:

        输入: [1,2,3,4,5]
        输出: 4
        解释: 在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
            注意你不能在第 1 天和第 2 天接连购买股票，之后再将它们卖出。
           因为这样属于同时参与了多笔交易，你必须在再次购买前出售掉之前的股票。
        示例3:

        输入: [7,6,4,3,1]
        输出: 0
        解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。*/
