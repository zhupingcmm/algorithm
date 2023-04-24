package com.mf.algorithm;

public class ReverseLeftWords58 {
    public static void main(String[] args) {
        ReverseLeftWords58 reverseLeftWords58 = new ReverseLeftWords58();
        reverseLeftWords58.reverseLeftWords("abcdefg", 2);
    }
    public String reverseLeftWords(String s, int n) {
       char [] chars = s.toCharArray();
       int slow = 0;
       int index = 0;
       int len = n;
       char [] tem = new char[len];
        for (int i = 0; i < chars.length; i++) {
            if (i > n - 1) {
                chars[slow++] = chars[i];
            } else {
                tem[index++] = chars[i];
            }
        }
        len = len -1;
        for (int i = chars.length -1; i < chars.length; i--) {
            if (len < 0) break;
            chars[i] = tem[len--];
        }
        return new String(chars);
    }
}
