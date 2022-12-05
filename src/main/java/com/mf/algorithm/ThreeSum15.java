package com.mf.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {
    public static void main(String[] args) {
        ThreeSum15 threeSum15 = new ThreeSum15();

        List<List<Integer>> result = threeSum15.threeSum(new int[]{-1,0,1,2,-1,-4});
        System.out.println(result);
    }

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length -1;
            // 对i去重
            if (i > 0 && nums[i] == nums[i-1]) continue;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < 0) {
                    // 对left去重
                    while ( left < right && nums[left] == nums[++left]) {}
                } else if (sum > 0) {
                    // 对right去重
                    while (left < right && nums[right] == nums[--right]) {}
                } else {
                    List<Integer> res = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(res);
                    // 对left去重
                    while ( left < right && nums[left] == nums[++left]) {}
                    // 对right去重
                    while (left < right && nums[right] == nums[--right]) {}
                }
            }
        }

        return result;

    }
}
