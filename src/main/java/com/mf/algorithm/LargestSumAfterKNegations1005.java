package com.mf.algorithm;

import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.IntStream;

public class LargestSumAfterKNegations1005 {
    public static void main(String[] args) {
        LargestSumAfterKNegations1005 largestSumAfterKNegations1005 = new LargestSumAfterKNegations1005();
        System.out.println(largestSumAfterKNegations1005.largestSumAfterKNegations(new int[]{-8,3,-5,-3,-5,-2}, 6));
    }
    public int largestSumAfterKNegations(int[] nums, int k) {
        nums = IntStream.of(nums)
                .boxed()
                .sorted((o1, o2) -> Math.abs(o2) - Math.abs(o1))
                .mapToInt(Integer::intValue).toArray();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            //从前向后遍历，遇到负数将其变为正数，同时K--
            if (nums[i] < 0 && k > 0) {
                nums[i] = -nums[i];
                k--;
            }
        }
        // 如果K还大于0，那么反复转变数值最小的元素，将K用完

        if (k % 2 == 1) nums[len - 1] = -nums[len - 1];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
