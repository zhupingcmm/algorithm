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


        return result;
    }

    public void dfs(int level, int[]nums,  List<List<Integer>> result, List<Integer> list) {
        if (level == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        //不选
        dfs(level + 1, nums, result, list);
        //选
        list.add(nums[level]);
        dfs(level + 1, nums, result, list);
        //reverse
        list.remove(list.size() -1);
    }
}
