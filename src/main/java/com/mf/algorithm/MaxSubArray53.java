package com.mf.algorithm;

import java.util.ArrayList;
import java.util.List;

public class MaxSubArray53 {
    public static void main(String[] args) {
        MaxSubArray53 maxSubArray53 = new MaxSubArray53();
        System.out.println(maxSubArray53.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));;
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
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(sum, max);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

}
