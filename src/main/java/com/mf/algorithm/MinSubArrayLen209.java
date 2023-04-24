package com.mf.algorithm;

public class MinSubArrayLen209 {
    public static void main(String[] args) {
        MinSubArrayLen209 minSubArrayLen209 = new MinSubArrayLen209();
        int result = minSubArrayLen209.minSubArrayLen(7, new int[]{2,3,1,2,4,3});
        System.out.println(result);

    }

    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                result = Math.min(result, i - left + 1);
                sum -= nums[left];
                left++;
            }

        }

        return result == Integer.MAX_VALUE ? 0 : result;

    }
}
