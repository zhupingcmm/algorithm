package com.mf.algorithm;

import java.util.LinkedList;

public class LengthOfLongestSubstring3 {
    public static void main(String[] args) {
        LengthOfLongestSubstring3 lengthOfLongestSubstring3 = new LengthOfLongestSubstring3();
        int result = lengthOfLongestSubstring3.lengthOfLongestSubstring("pwwkew");
        System.out.println(result);
    }
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        LinkedList<Character> queue = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            if(queue.contains(item)) {
                int index = 0;
                for (int j = 0; j < queue.size(); j++) {
                    if (item == queue.get(j)){
                        index = j;
                        break;
                    }
                }
                while (index != -1) {
                    queue.remove();
                    index --;
                }

            }
            queue.add(item);
            max = Math.max(max, queue.size());
        }
        return max;
    }
}
