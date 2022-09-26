package com.mf.algorithm;

import java.util.ArrayList;
import java.util.List;

public class MaxSubArray53 {
    public static void main(String[] args) {
        MaxSubArray53 maxSubArray53 = new MaxSubArray53();
        maxSubArray53.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }
    public int maxSubArray(int[] nums) {
        int [] dp = new int[nums.length + 1];
        dp[0] = 0;
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i -1] + nums[i], nums[i]);
            result = Math.max(result, dp[i]);
        }
        return result;
    }

    private void helper(int level, int[] nums, List<Integer> list, List<List<Integer>> result) {
        if (level == nums.length) {
            result.add(new ArrayList<Integer>(list));
            return;
        }

        helper(level + 1, nums, list, result);

        list.add(nums[level]);
        helper(level + 1, nums, list, result);

        list.remove(list.size() -1);


    }
}
