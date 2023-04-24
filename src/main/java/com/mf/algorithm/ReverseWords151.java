package com.mf.algorithm;

public class ReverseWords151 {
    public static void main(String[] args) {
        ReverseWords151 reverseWords151 = new ReverseWords151();
        System.out.println(reverseWords151.reverseWords("a good   example"));
    }

    public String reverseWords(String s) {
        String [] strs = s.trim().split(" ");
        // 翻转
        int left = 0;
        int right = strs.length -1;
        while (left <= right) {
            String temp = strs[left];
            strs[left++] = strs[right];
            strs[right--] = temp;
        }
        // 去空格
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strs.length; i++) {
            if (!strs[i].equals("")) {
                sb.append(strs[i]);
                if (i != strs.length -1) {
                    sb.append(" ");
                }
            }

        }

        return sb.toString();

    }
}
