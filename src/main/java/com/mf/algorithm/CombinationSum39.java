package com.mf.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum39 {

    private List<List<Integer>> result = new ArrayList<>();

    private List<Integer> paths = new ArrayList<>();
    private int sum = 0;

    public static void main(String[] args) {
        CombinationSum39 combinationSum39 = new CombinationSum39();
        System.out.println(combinationSum39.combinationSum(new int[]{2,3,6,7}, 7));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(0, candidates, target);
        return result;
    }

    private void dfs(int startIndex, int[] candidates, int target) {

        if (sum == target) {
            result.add(new ArrayList<>(paths));
            return;
        }
        if (sum > target) return;

        for (int i = startIndex; i < candidates.length; i++) {
            paths.add(candidates[i]);
            sum += candidates[i];
            dfs(i, candidates, target);
            sum -= candidates[i];
            paths.remove(paths.size() -1);
        }
    }
}
