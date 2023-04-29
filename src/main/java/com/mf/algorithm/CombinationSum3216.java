package com.mf.algorithm;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3216 {

    public static void main(String[] args) {
        CombinationSum3216 combinationSum3216 = new CombinationSum3216();
        combinationSum3216.combinationSum3(3, 7);
    }

    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> paths = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(1, k, n);

        return result;
    }

    private void  dfs (int startIndex, int k , int n) {
        if (paths.size() ==k) {

            int res = 0;
            for (int i = 0; i < paths.size(); i++) {
                res+=paths.get(i);
            }
            if (res == n) {
                result.add(new ArrayList<>(paths));
            }
            return;
        }

        for (int i = startIndex; i <= 9; i++) {
            paths.add(i);
            dfs(i + 1, k, n);
            paths.remove(paths.size() -1);
        }
    }


}
