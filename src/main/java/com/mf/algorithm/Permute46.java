package com.mf.algorithm;

import java.util.*;

public class Permute46 {

    public static void main(String[] args) {
        Permute46 permute46 = new Permute46();
        System.out.println(permute46.permute(new int[]{1,2,3}));
    }

    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> paths = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        int [] used = new int[nums.length];
        dfs(nums, used);
        return result;

    }

    private void dfs (int[] nums, int [] used) {
        if (paths.size() == nums.length) {
            result.add(new ArrayList<>(paths));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // 树枝上去重
            if (used[i] == 1) continue;
            paths.add(nums[i]);
            used[i] = 1;
            dfs(nums, used);
            used[i] = 0;
            paths.remove(paths.size() -1);
        }
    }
}
