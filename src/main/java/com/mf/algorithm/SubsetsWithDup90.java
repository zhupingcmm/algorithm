package com.mf.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsWithDup90 {

    public static void main(String[] args) {
        SubsetsWithDup90 subsetsWithDup90 = new SubsetsWithDup90();
        System.out.println(subsetsWithDup90.subsetsWithDup(new int[]{1,2,2}));;
    }

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> paths = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(0, nums);
        return result;
    }

    private void dfs (int startIndex, int[] nums) {
        result.add(new ArrayList<>(paths));
        if (startIndex >= nums.length) return;

        for (int i = startIndex; i < nums.length; i++) {
            if (i> startIndex && nums[i] == nums[i-1]) continue;
            paths.add(nums[i]);
            dfs(i + 1, nums);
            paths.remove(paths.size() -1);
        }
    }


}
