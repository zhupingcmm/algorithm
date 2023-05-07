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

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> paths = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(0, candidates, target);
        return result;

    }

    private void  dfs (int startIndex, int[] candidates, int target) {
        if (target <= 0) {
            if (target == 0) {
                result.add(new ArrayList<>(paths));
            }
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            if (i > startIndex && candidates[i] == candidates[i-1]) continue;
            paths.add(candidates[i]);
            target -= candidates[i];
            dfs(i + 1, candidates, target);
            paths.remove(paths.size() -1 );
            target += candidates[i];
        }
    }


}
