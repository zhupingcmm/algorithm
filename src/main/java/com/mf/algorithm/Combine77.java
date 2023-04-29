package com.mf.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Combine77 {

    public static void main(String[] args) {
        Combine77 combine77 = new Combine77();
        System.out.println(combine77.combine(4, 2));;
    }

    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> paths = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        dfs(1, n, k);
        return result;
    }

    private void dfs (int startIndex, int n, int k) {

        if (paths.size() == k) {
            result.add(new ArrayList<>(paths));
            return;
        }

        for (int i = startIndex; i <= n; i++) {
                if (n - i + 1 < k - paths.size()) break;
            paths.add(i);
            dfs(i + 1, n, k);
            paths.remove(paths.size() -1);
        }
    }



}
