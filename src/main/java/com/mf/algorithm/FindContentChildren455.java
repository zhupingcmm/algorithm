package com.mf.algorithm;

import java.util.Arrays;

public class FindContentChildren455 {
    public static void main(String[] args) {
        FindContentChildren455 contentChildren455 = new FindContentChildren455();
       int count =  contentChildren455.findContentChildren(new int[]{1,2,3}, new int[]{1,1});
        System.out.println(count);
    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int start = s.length -1;

        for (int index = g.length -1 ; index >= 0; index--) {
            if (start >= 0 && g[index] <= s[start]) {
                start--;
                count++;
            }
        }
        return count;
    }
}
