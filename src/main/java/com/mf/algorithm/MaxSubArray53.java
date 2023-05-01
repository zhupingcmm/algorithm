package com.mf.algorithm;

import java.util.ArrayList;
import java.util.List;

public class MaxSubArray53 {
    public static void main(String[] args) {
        MaxSubArray53 maxSubArray53 = new MaxSubArray53();
        System.out.println(maxSubArray53.maxSubArray(new int[]{5,4,-1,7,8}));;
    }
//    public int maxSubArray(int[] nums) {
//        int n = nums.length;
//
//        int [] dp = new int [n + 1];
//
//        dp[0] = nums[0];
//        int max = nums[0];
//        for(int i =1; i < n; i++){
//            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
//            max = Math.max(dp[i], max);
//        }
//
//        return max;
//    }

    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxSum = Math.max(sum, maxSum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }

}
