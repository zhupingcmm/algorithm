package com.mf.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subsets78 {
    public static void main(String[] args) {
        int [] nums = new int[]{1,2,3};
        Subsets78 subsets = new Subsets78();
        System.out.println(subsets.subsets(nums));
    }


    private LinkedList<Integer> paths = new LinkedList<>();
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums);
        return result;
    }


    private void dfs(int start, int[] nums) {

        result.add(new ArrayList<>(paths));

        if (start >= nums.length) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            paths.add(nums[i]);
            dfs(i + 1, nums);
            paths.removeLast();
        }
    }

}
