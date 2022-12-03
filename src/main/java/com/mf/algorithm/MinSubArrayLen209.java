package com.mf.algorithm;

public class MinSubArrayLen209 {
    public static void main(String[] args) {
        MinSubArrayLen209 minSubArrayLen209 = new MinSubArrayLen209();
        int result = minSubArrayLen209.minSubArrayLen(7, new int[]{2,3,1,2,4,3});
        System.out.println(result);

    }

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left--];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
