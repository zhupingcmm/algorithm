package com.mf.algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CoinChange322 {
    public static void main(String[] args) {
        CoinChange322 change322 = new CoinChange322();
        int result = change322.coinChange(new int[]{2}, 3);
        System.out.println(result);
    }
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int [] dp = new int[max];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount ; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <=i){
                    dp[i] = Math.min(dp[i],dp[i -coins[j]] + 1 );
                }
            }
        }

        return dp[amount] == max ? -1 : dp[amount];
    }
}
