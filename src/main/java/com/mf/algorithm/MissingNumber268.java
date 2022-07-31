package com.mf.algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNumber268 {
    public static void main(String[] args) {
        MissingNumber268 missingNumber268 = new MissingNumber268();
       int result = missingNumber268.missingNumber(new int[]{9,6,4,2,3,5,7,0,1});
        System.out.println(result);
    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != n) return i;
        }

        return n;
    }


}
