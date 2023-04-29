package com.mf.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RestoreIpAddresses93 {
    public static void main(String[] args) {
        RestoreIpAddresses93 restoreIpAddresses93 = new RestoreIpAddresses93();
        System.out.println(restoreIpAddresses93.restoreIpAddresses("25525511135"));
    }

    private List<List<String>> result = new ArrayList<>();

    private List<String> paths = new ArrayList<>();

    public List<List<String>> restoreIpAddresses(String s) {
        dfs(0, s);
        return result;
    }

    private void dfs (int startIndex, String s) {
        if (startIndex == 4) {
            result.add(new ArrayList<>(paths));
            return;
        }

        for (int i = startIndex; i < s.length(); i++) {
            if (!isValid(s, startIndex, i)) continue;
            String str = s.substring(startIndex, i + 1);
            paths.add(str);
            dfs(i + 1, s);
            paths.remove(paths.size() -1);
        }

    }

    private boolean isValid(String s, int start, int end) {
        if (end - start + 1 > 3) return false;
        if (s.charAt(start) == '0') return false;
        for (int i = start; i <= end ; i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') return false;
        }
        if (Integer.parseInt(s.substring(start, end + 1)) > 255) return false;

        return true;

    }

}
