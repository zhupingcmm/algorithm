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
        for (int num : nums) {

            if (num < 0) {
                int tmp = imax;
                imax = imin;
                imin = tmp;
            }
            imax = Math.max(imax * num, num);
            imin = Math.min(imin * num, num);
            max = Math.max(max, imax);
        }

        return max;
    }
}
