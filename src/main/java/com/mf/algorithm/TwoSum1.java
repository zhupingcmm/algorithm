package com.mf.algorithm;

public class TwoSum1 {
    public static void main(String[] args) {
        TwoSum1 twoSum1 = new TwoSum1();
        int [] index = twoSum1.twoSum(new int[]{3,2,4}, 6);
        System.out.println(index);

    }

    public int[] twoSum(int[] nums, int target) {
//        int [] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[2];
    }
}


