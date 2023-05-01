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
        int index = s.length -1;
        // 从大到小遍历 孩子的胃口
        for (int i = g.length -1; i >= 0; i--) {
            // 尽量去满足胃口大的孩子
            if (index >= 0 && s[index] >= g[i]) {
                count++;
                index--;
            }
        }
        return count;
    }
}
