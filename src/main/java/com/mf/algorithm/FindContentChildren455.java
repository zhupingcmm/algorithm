package com.mf.algorithm;

import java.util.Arrays;

public class FindContentChildren455 {
    public static void main(String[] args) {
        FindContentChildren455 contentChildren455 = new FindContentChildren455();
       int count =  contentChildren455.findContentChildren(new int[]{10,9,8,7}, new int[]{5,6,7,8});
        System.out.println(count);
    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int count = 0;

        int len = s.length -1;
        for (int i = g.length -1; i >= 0; i--) {
            if (len >= 0 && s[len] >= g[i] ) {
                len--;
                count++;
            }
        }

        return count;
    }
}
