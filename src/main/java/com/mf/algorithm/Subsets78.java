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

        private List<List<Integer>> result = new ArrayList<>();
        private List<Integer> paths = new ArrayList<>();
        public List<List<Integer>> subsets(int[] nums) {
            dfs(0, nums);
            return result;


        }

        private void dfs (int startIndex, int [] nums) {
            result.add(new ArrayList<>(paths));
            if (startIndex >= nums.length) return;

            for (int i = startIndex; i < nums.length; i++) {
                paths.add(nums[i]);

                dfs(i + 1, nums);
                paths.remove(paths.size() -1);
            }
        }

}
