package com.mf.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combine77 {

    private List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        dfs(1, n,k);
        return result;

    }

    private void dfs(int start, int n, int k) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i<= (n -(k -path.size()) + 1); i++) {
            path.add(i);
            dfs(i + 1, n, k);
            path.removeLast();
        }
    }


}
