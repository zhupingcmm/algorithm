package com.mf.algorithm;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar387 {
    public static void main(String[] args) {
        FirstUniqChar387 firstUniqChar387 = new FirstUniqChar387();
        int result = firstUniqChar387.firstUniqChar("leetcode");
        System.out.println(result);
    }
    public int firstUniqChar(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            if (map.get(item) == 1) {
                return i;
            }
        }

        return -1;
    }
}
