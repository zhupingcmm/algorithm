package com.mf.algorithm;

import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.IntStream;

public class LargestSumAfterKNegations1005 {
    public static void main(String[] args) {
        LargestSumAfterKNegations1005 largestSumAfterKNegations1005 = new LargestSumAfterKNegations1005();
        System.out.println(largestSumAfterKNegations1005.largestSumAfterKNegations(new int[]{2,-3,-1,5,-4}, 2));
    }
    public int largestSumAfterKNegations(int[] nums, int k) {
        nums = IntStream.of(nums)
                .boxed().sorted((a,b)-> Math.abs(b) - Math.abs(a))
                .mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <0 && k > 0) {
                nums[i] = -nums[i];
                k--;
            }
        }

        if (k % 2 == 1) nums[nums.length -1] = - nums[nums.length -1];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;

    }
}
