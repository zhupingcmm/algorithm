package com.mf.algorithm;

public class ReverseString344 {

    public static void main(String[] args) {
        ReverseString344 reverseString344 = new ReverseString344();
        reverseString344.reverseString(new char[]{'h','e','l','l','o'});
    }

    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length -1;
        while (left < right) {
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }

        System.out.println(s);
    }
}
