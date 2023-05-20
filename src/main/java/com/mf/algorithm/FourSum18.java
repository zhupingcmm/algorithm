package com.mf.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum18 {
    public static void main(String[] args) {
        FourSum18 fourSum14 = new FourSum18();
        List<List<Integer>> res = fourSum14.fourSum(new int[]{1,-2,-5,-4,-3,3,3,5}, -11);
        System.out.println(res);
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length -3; i++) {
            if(i> 0 &&nums[i] == nums[i-1]) continue;
            if ( nums[i] > 0 && nums[i] > target) break;
            for (int j = i  + 1; j < nums.length -2; j++) {
                if (j > i + 1 && nums[j] == nums[j-1]) continue;
                int left = j + 1;
                int right = nums.length -1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum < target) {
                        while (left < right && nums[left] == nums[++left]){};
                    } else if (sum > target) {
                        while (left < right && nums[right] == nums[--right]){}
                    } else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[++left]){};
                        while (left < right && nums[right] == nums[--right]){}
                    }
                }
            }

        }

        return result;
    }
}
