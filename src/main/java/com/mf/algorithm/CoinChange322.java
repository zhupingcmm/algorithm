package com.mf.algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CoinChange322 {
    private int res = Integer.MAX_VALUE;
    public static void main(String[] args) {
        CoinChange322 change322 = new CoinChange322();
        int result = change322.coinChange(new int[]{1,2,5}, 11);
        System.out.println(result);
    }




    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int [] dp = new int[max];
        Arrays.fill(dp, max);

        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i -coin] + 1);
                }

            }
        }

        return dp[amount] == max ? -1 : dp[amount];
    }
//    public int coinChange(int[] coins, int amount) {
//        if(coins.length == 0){
//            return -1;
//        }
//
//        findWay(coins,amount,0);
//
//        // 如果没有任何一种硬币组合能组成总金额，返回 -1。
//        if(res == Integer.MAX_VALUE){
//            return -1;
//        }
//        return res;
//    }
//
//    public void findWay(int[] coins,int amount,int count){
//        if(amount < 0){
//            return;
//        }
//        if(amount == 0){
//            res = Math.min(res,count);
//        }
//
//        for(int i = 0;i < coins.length;i++){
//            findWay(coins,amount-coins[i],count+1);
//        }
//    }

//    public int coinChange(int[] coins, int amount) {
//        int max = amount + 1;
//        int [] dp = new int[max];
//        Arrays.fill(dp, max);
//        dp[0] = 0;
//
//        for (int i = 0; i <= amount; i++) {
//            for (int coin : coins) {
//                if (coin <= i) {
//                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
//                }
//            }
//        }
//        return dp[amount] == max ? -1 : dp[amount];
//    }
}
