package com.mf.algorithm;

public class ReverseStr541 {
    public static void main(String[] args) {
        ReverseStr541 reverseStr541 = new ReverseStr541();
        reverseStr541.reverseStr("abcdefg", 2);
    }
    public String reverseStr(String s, int k) {
        char [] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i+=2*k) {
            int left = i; int right = i + k -1;
            if (s.length() - i < k) {
                right = s.length() - 1;
                reverse(ch, left, right);
                continue;
            }
            reverse(ch, left, right);
        }
        return new String(ch);
    }

    private void reverse (char [] chars, int left, int right) {
        while (left < right) {
            char temp =  chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
    }
}
