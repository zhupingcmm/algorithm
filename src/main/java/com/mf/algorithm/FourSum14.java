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

        for (int i = 0; i < nums.length - 3; i++) {

            // nums[i] > target 直接返回, 剪枝操作
            if (nums[i] > 0 && nums[i] > target) {
                return result;
            }

            if (i > 0 && nums[i - 1] == nums[i]) {    // 对nums[i]去重
                continue;
            }

            for (int j = i + 1; j < nums.length -2; j++) {

                if (j > i + 1 && nums[j - 1] == nums[j]) {  // 对nums[j]去重
                    continue;
                }

                int left = j + 1;
                int right = nums.length - 1;
                while (right > left) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum > target) {
                        while (right > left && nums[right] == nums[--right]) {};
                    } else if (sum < target) {
                        while (right > left && nums[left] == nums[++left]) {};
                    } else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        // 对nums[left]和nums[right]去重
                        while (right > left && nums[right] == nums[--right]) {};
                        while (right > left && nums[left] == nums[++left]) {};
                    }
                }
            }
        }
        return result;

    }
}
