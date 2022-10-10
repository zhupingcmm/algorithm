package com.mf.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Subsets78 {
    public static void main(String[] args) {
        int [] nums = new int[]{1,2,3};
        Subsets78 subsets = new Subsets78();
        subsets.subsets(nums);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(0, nums, new ArrayList<>(), result);
        System.out.println(result);
        return result;
    }

    private void dfs (int level, int [] nums, List<Integer> list, List<List<Integer>> result){
        if (level == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        // 不选
        dfs(level + 1, nums, list, result);

        // 选
        list.add(nums[level]);
        dfs(level + 1, nums, list, result);

        list.remove(list.size() - 1);
    }
}
