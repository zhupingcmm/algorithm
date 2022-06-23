package com.mf.algorithm;

public class TwoSum1 {
    public static void main(String[] args) {
        TwoSum1 twoSum1 = new TwoSum1();
        int [] index = twoSum1.twoSum(new int[]{3,2,3}, 6);
        System.out.println(index);

    }

    public int[] twoSum(int[] nums, int target) {
        int [] a = new int[2];
        for (int i = 0; i < nums.length -1; i++) {
            for (int j = i + 1; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }

        return new int[0];
    }
}


