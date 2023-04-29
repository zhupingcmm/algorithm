package com.mf.algorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermuteUnique47 {

    public static void main(String[] args) {
        PermuteUnique47 permuteUnique47 = new PermuteUnique47();
        System.out.println(permuteUnique47.permuteUnique(new int[]{1,1,2}));;
    }

    private List<List<Integer>> result = new ArrayList<>();

    private List<Integer> paths = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        int [] used = new int[nums.length];
        Arrays.sort(nums);

        dfs(nums, used);

        return result;
    }

    private void dfs(int[] nums,  int [] used ) {
        if (paths.size() == nums.length) {
            result.add(new ArrayList<>(paths));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // 树层上 去重
            if ( i > 0 && nums[i] == nums[i-1] && used[i -1] == 0) continue;
            // 树枝上 去重
            if (used[i] == 1) continue;
            used[i] = 1;
            paths.add(nums[i]);

            dfs(nums, used);

            used[i] =0;
            paths.remove(paths.size() -1);
        }
    }
}
