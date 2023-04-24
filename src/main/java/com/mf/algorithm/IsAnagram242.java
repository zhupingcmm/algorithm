package com.mf.algorithm;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram242 {

    public static void main(String[] args) {
        IsAnagram242 isAnagram242 = new IsAnagram242();
        boolean result = isAnagram242.isAnagram("aa", "ba");
        System.out.println(result);
    }
        public boolean isAnagram(String s, String t) {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                Character key = s.charAt(i);
                if (map.containsKey(key)) {
                    Integer val = map.get(key);
                    map.put(key, val + 1);
                } else {
                    map.put(key, 1);
                }
            }

            for (int i = 0; i < t.length(); i++) {
                Character key = t.charAt(i);
                if (map.containsKey(key)) {
                    Integer val = map.get(key);
                    map.put(key, val -1);
                } else {
                    return false;
                }

            }

            for (Integer value : map.values()) {
                if (value != 0) {
                    return false;
                }
            }
            return true;
        }
}
