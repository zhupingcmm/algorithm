package com.mf.algorithm;

import java.util.HashMap;

public class IsAnagram242 {

    public static void main(String[] args) {
        IsAnagram242 isAnagram242 = new IsAnagram242();
        boolean result = isAnagram242.isAnagram("ba", "ab");
        System.out.println(result);
    }
    public boolean isAnagram(String s, String t) {
        String [] sData = s.split("");
        String [] tData = t.split("");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < sData.length; i++) {
            String item = sData[i];
            if (!map.containsKey(item)) {
                map.put(item, 1);
            } else {
                int val = map.get(item) + 1;
                map.put(item,val);
            }
        }
        for (int i = 0; i < tData.length; i++) {
            String item = tData[i];
            if (map.containsKey(item)) {
                int value = map.get(item);
                if (value <= 0) {
                    return false;
                }
                value -= 1;
                map.put(item, value);
            } else {
                return false;            }
        }

        for (String key: map.keySet()) {

            if (!map.get(key).equals(0)) {
                return false;
            }
        }
        return true;
    }
}
