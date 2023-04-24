package com.mf.algorithm;

public class ReverseStr541 {
    public static void main(String[] args) {
        ReverseStr541 reverseStr541 = new ReverseStr541();
        reverseStr541.reverseStr("abcdefg", 2);
    }
    public String reverseStr(String s, int k) {
        char [] chars = s.toCharArray();
        // 每次跳 2k i+=2*k
        for (int i = 0; i < chars.length; i+=2*k) {
            int left = i;
            // i + k -1
            int right = i + k -1;

            // 如果总长 减去 2k 剩余部分小于 k 就翻转
            if (chars.length - i < k) {
                right = s.length() - 1;
                reverse(chars, left, right);
                continue;
            }
            reverse(chars, left, right);

        }
        return new String(chars);

    }

    private static void reverse (char [] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }

    }
}
