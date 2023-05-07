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

        dfs(nums, new int[nums.length]);
        return result;
    }


    private void  dfs (int [] nums, int [] used) {
        if (paths.size() == nums.length) {
            result.add(new ArrayList<>(paths));
            return;
        }
//        if (paths.size() >= nums.length)

        for (int i = 0; i < nums.length; i++) {
            if (used[i] == 1) continue;

            used[i] = 1;
            paths.add(nums[i]);
            dfs(nums, used);
            paths.remove(paths.size() -1);
            used[i] = 0;
        }
    }
}
