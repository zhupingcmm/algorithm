package com.mf.algorithm;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Partition131 {
    public static void main(String[] args) {

        Partition131 partition131 = new Partition131();
        System.out.println(partition131.partition("aab"));;

    }

    private List<List<String>> result = new ArrayList<>();

    private List<String> paths = new ArrayList<>();

    public List<List<String>> partition(String s) {
        dfs(0, s);
        return result;


    }

    private void dfs (int startIndex, String s) {
        if (startIndex >= s.length()) {
            result.add(new ArrayList<>(paths));
        }

        for (int i = startIndex; i < s.length(); i++) {
            if (!isPartition(s, startIndex, i)) continue;
            String str = s.substring(startIndex, i + 1);
            paths.add(str);
            dfs(i + 1, s);
            paths.remove(paths.size() -1);
        }
    }

    private boolean isPartition(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }


}
