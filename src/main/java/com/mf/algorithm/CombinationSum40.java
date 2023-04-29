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

    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> paths = new ArrayList<>();

    private int sum = 0;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(0, candidates, target);
        return result;
    }

    private void dfs(int startIndex,int[] candidates, int target){

        if (sum == target) {
            result.add(new ArrayList<>(paths));
        }
        if (sum > target) return;

        for (int i = startIndex; i < candidates.length; i++) {
            if (i > startIndex && candidates[i] == candidates[i-1]) continue;
            paths.add(candidates[i]);
            sum += candidates[i];
            dfs(i + 1, candidates, target);
            sum -= candidates[i];
            paths.remove(paths.size() -1);
        }

    }


}
