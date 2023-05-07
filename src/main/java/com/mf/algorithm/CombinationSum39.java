package com.mf.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum39 {

    private List<List<Integer>> result = new ArrayList<>();

    private List<Integer> paths = new ArrayList<>();

    private int sum = 0;


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(0, candidates, target);
        return result;

    }

    private void dfs (int startIndex, int[] candidates, int target) {
        if (sum >= target) {
            if (sum == target) {
                result.add(new ArrayList<>(paths));
            }

            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            paths.add(candidates[i]);
            sum += candidates[i];
            dfs(i, candidates, target);
            sum -= candidates[i];
            paths.remove(paths.size() -1);
        }

    }


}
