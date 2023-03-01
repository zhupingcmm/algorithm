package com.mf.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum39 {

    public static void main(String[] args) {
        CombinationSum39 combinationSum39 = new CombinationSum39();
        System.out.println(combinationSum39.combinationSum(new int[]{2,3,6,7}, 7));
    }

    List<List<Integer>> result = new ArrayList<>();
    private LinkedList<Integer> paths = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(0, candidates, target, 0);
        return result;
    }


    private void dfs(int start, int[] candidates, int target, int sum){
        if (sum > target) return;
        if (sum == target) {
            result.add(new ArrayList<>(paths));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            paths.add(candidates[i]);
            sum+=candidates[i];
            dfs(i, candidates, target, sum);
            paths.removeLast();
            sum-=candidates[i];
        }


    }
}
