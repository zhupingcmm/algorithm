package com.mf.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum216 {

    public static void main(String[] args) {
        CombinationSum216 combinationSum216 = new CombinationSum216();
        System.out.println(combinationSum216.combinationSum3(3, 9));
    }

    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> paths = new ArrayList<>();
    private int sum = 0;

    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(1, k, n);
        return result;
    }

    private void dfs (int startIndex, int k , int n) {
        if (sum >= n) {
            if (paths.size() == k && sum == n) {
                result.add(new ArrayList<>(paths));
            }
            return;
        }

        for (int i = startIndex; i <= 9; i++) {
            paths.add(i);
            sum += i;
            dfs(i+1, k, n);
            sum -= i;
            paths.remove(paths.size() -1);
        }

    }


}
