/*
package com.yiming.java1106;

//有硬币 2 5  7  拼购27块钱最少要多少枚硬币
public class Topic03 {
    public static void main(String[] args) {

    }
    public static int doSome(int[] A , int M){
        int[] f = new int[M+1];

        int len = A.length;

        f[0] = 0 ;

        int i, j ;

        for( i = 1 ; i < M ; i++){
            f[i]=Integer.MAX_VALUE;

            // f [ i ] = min{f[i-A[0]] + 1 ,......, f[ i - A[n-1] ] + 1 }

            for( j = 0 ; j < len  ; ++j){
                if(i>= A[j] && f[i-A[j]] != Integer.MAX_VALUE ) {
                    f[i] = Math.min(f[i - A[j]] + 1, f[i]);
                }
            }
        }
    }
}
*/
