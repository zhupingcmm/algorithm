package com.mf.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum216 {

    private List<List<Integer>> result = new ArrayList<>();

    private LinkedList<Integer> paths = new LinkedList<>();

    public static void main(String[] args) {
        CombinationSum216 combinationSum216 = new CombinationSum216();
        System.out.println(combinationSum216.combinationSum3(4, 1));
    }

    public List<List<Integer>> combinationSum3(int k, int n) {

        dfs(1, k, n);
        return result;
    }


    private void dfs(int start, int k, int n){

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

        for (int i = start; i <= 9; i++) {
            paths.add(i);
            dfs(i + 1, k, n);
            paths.removeLast();
        }
    }



}
