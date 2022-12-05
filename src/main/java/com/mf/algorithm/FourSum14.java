package com.mf.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum14 {
    public static void main(String[] args) {
        FourSum14 fourSum14 = new FourSum14();
        List<List<Integer>> res = fourSum14.fourSum(new int[]{-2,-1,-1,1,1,2,2}, 8);
        System.out.println(res);
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length -3; i++) {
            if (nums[i] > target) break;
            if (i > 0 && nums[i] == nums[i-1]) continue;
            for (int j = i + 1; j < nums.length -2; j++) {
                if (j > i + 1 && nums[j] == nums[j-1]) continue;

                int left = j + 1;
                int right = nums.length -1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum < target) {
                        while (left < right && nums[left] == nums[++left]){}
                    } else if (sum > target) {
                        while (left < right && nums[right] == nums[--right]){}
                    } else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[++left]){}
                        while (left < right && nums[right] == nums[--right]){}
                    }
                }
            }
        }

        return result;

    }
}
