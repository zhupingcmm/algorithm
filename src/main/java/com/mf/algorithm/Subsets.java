package com.mf.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int [] nums = new int[]{1,2,3};
        Subsets subsets = new Subsets();
        subsets.subsets(nums);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(0,nums, new ArrayList<>(), result);
        return result;
    }

    private void dfs(int currentLevel,int [] nums, List<Integer> list,List<List<Integer>> result) {
        if (currentLevel == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        dfs(currentLevel + 1, nums, list, result);
        list.add(nums[currentLevel]);
        dfs(currentLevel + 1, nums, list, result);

        list.remove(list.size() -1);
    }
}
