package com.mf.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RestoreIpAddresses93 {
    public static void main(String[] args) {
        RestoreIpAddresses93 restoreIpAddresses93 = new RestoreIpAddresses93();
        System.out.println(restoreIpAddresses93.restoreIpAddresses("25525511135"));
    }

    List<String> result = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        dfs(0, 0, s);
        return result;
    }

    private void dfs(int start, int pointSum, String s) {
        if (pointSum == 3) {
            if (isvalid(start, s.length() -1, s)) {
                result.add(s);
            }
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (isvalid(start, i, s)) {
                s = s.substring(0, i+1) + "." + s.substring(i+1);
                pointSum++;
                dfs(i +2, pointSum, s);
                pointSum--;
                s = s.substring(0, i+1) + s.substring(i+2);

            } else {
                break;
            }

        }
    }

    private boolean isvalid(int start, int end, String s){
        if (start > end) {
            return false;
        }
        if (s.charAt(start) == '0' && start != end) { // 0开头的数字不合法
            return false;
        }
        int num = 0;
        for (int i = start; i <= end; i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') { // 遇到⾮数字字符不合法
                return false;
            }
            num = num * 10 + (s.charAt(i) - '0');
            if (num > 255) { // 如果⼤于255了不合法
                return false;
            }
        }
        return true;
    }
}
