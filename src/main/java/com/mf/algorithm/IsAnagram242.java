package com.mf.algorithm;

import java.util.HashMap;

public class IsAnagram242 {

    public static void main(String[] args) {
        IsAnagram242 isAnagram242 = new IsAnagram242();
        boolean result = isAnagram242.isAnagram("ab", "a");
        System.out.println(result);
    }
    public boolean isAnagram(String s, String t) {

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            String tmp = String.valueOf(s.charAt(i));
            if (map.containsKey(tmp)) {
                map.put(tmp, map.get(tmp) + 1);
            } else {
                map.put(tmp,1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            String temp = String.valueOf(t.charAt(i));
            if (map.get(temp) == null || map.get(temp) <=0) return false;
            map.put(temp, map.get(temp) - 1);
        }

        for (String key: map.keySet()) {

            if (!map.get(key).equals(0)) {
                return false;
            }
        }


        return true;
    }
}
