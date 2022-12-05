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
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            Character key = t.charAt(j);
            if (map.containsKey(key)) {
                int val = map.get(key);
                if (val == 0) return false;
                map.put(key, val - 1);
            } else {
                return false;
            }
        }
        for (int val : map.values()) {
            if (val != 0) return false;
        }
        return true;
    }
}
