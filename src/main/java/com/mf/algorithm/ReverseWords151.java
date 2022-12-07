package com.mf.algorithm;

public class ReverseWords151 {
    public static void main(String[] args) {
        ReverseWords151 reverseWords151 = new ReverseWords151();
        System.out.println(reverseWords151.reverseWords("  hello world  "));
    }

    public String reverseWords(String s) {
        char [] chars = s.toCharArray();
        int slow = 0;
        for (int fast = 0; fast < chars.length; fast++) {
            if (chars[fast] != ' ') {
                if (slow != 0)
                    chars[slow++] = ' ';
                chars[slow++] = chars[fast];
            }
        }

        return new String(chars);
    }
}
