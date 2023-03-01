package com.mf.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permute46 {

    public static void main(String[] args) {
        Permute46 permute46 = new Permute46();
        System.out.println(permute46.permute(new int[]{1,2,3}));
    }

    private LinkedList<Integer> paths = new LinkedList<>();
    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        dfs(0, nums);
        return result;
    }

    private void dfs (int start, int[] nums) {
        if (start == nums.length) {
            result.add(new ArrayList<>(paths));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            paths.add(nums[i]);
            dfs(i + 1, nums);
            paths.removeLast();
        }

    }
}
