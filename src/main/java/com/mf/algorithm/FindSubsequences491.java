package com.mf.algorithm;

import java.util.*;

public class FindSubsequences491 {

    public static void main(String[] args) {
        FindSubsequences491 findSubsequences491 = new FindSubsequences491();
        System.out.println(findSubsequences491.findSubsequences(new int[]{4,4,3,2,1}));;
    }

    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> paths = new ArrayList<>();


    public List<List<Integer>> findSubsequences(int[] nums) {
        dfs(0, nums);
        return result;

    }

    private void  dfs(int startIndex, int[] nums) {
        if (paths.size() >= 2) {
            result.add(new ArrayList<>(paths));
        }

        if (startIndex >= nums.length) return;
        Set<Integer> set = new HashSet<>();

        for (int i = startIndex; i < nums.length; i++) {
            if (set.contains(nums[i]) || (!paths.isEmpty() && nums[i] < paths.get(paths.size() -1))) continue;
            set.add(nums[i]);
            paths.add(nums[i]);
            dfs(i + 1, nums);
            paths.remove(paths.size() -1);
        }
    }
}
