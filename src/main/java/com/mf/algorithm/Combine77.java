package com.mf.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combine77 {

    private List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {

        return result;
    }

    private void dfs (int level, int n, int k) {
       if (path.size() == k) {
           result.add(new ArrayList<>(path));
       }



    }




}
