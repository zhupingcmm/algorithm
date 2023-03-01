package com.mf.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum40 {

    public static void main(String[] args) {
        CombinationSum40 combinationSum40 = new CombinationSum40();
        System.out.println(combinationSum40.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
    }

    private  List<List<Integer>> result = new ArrayList<>();
    private LinkedList<Integer> paths = new LinkedList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
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
            dfs(i+ 1, candidates, target, sum);
            paths.removeLast();
            sum-=candidates[i];
        }

    }
}
