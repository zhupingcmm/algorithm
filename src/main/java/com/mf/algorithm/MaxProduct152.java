package com.mf.algorithm;

import java.util.Arrays;

public class MaxProduct152 {
    public static void main(String[] args) {
        MaxProduct152 maxProduct152 = new MaxProduct152();
        maxProduct152.maxProduct(new int[]{2,3,-2,4});
    }

    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int imax = 1;
        int imin = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int tem = imax;
                imax = imin;
                imin = tem;
            }
            imax = Math.max(imax* nums[i], nums[i]);
            imin = Math.min(imin* nums[i], nums[i]);
            max = Math.max(max, imax);
        }
        return max;
    }
}
