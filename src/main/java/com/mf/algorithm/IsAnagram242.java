package com.mf.algorithm;

import java.util.HashMap;

public class IsAnagram242 {

    public static void main(String[] args) {
        IsAnagram242 isAnagram242 = new IsAnagram242();
        boolean result = isAnagram242.isAnagram("a", "ab");
        System.out.println(result);
    }
    public boolean isAnagram(String s, String t) {
        String [] sData = s.split("");
        String [] tData = t.split("");
        HashMap<String, Integer> sMap = new HashMap<>();
        HashMap<String, Integer> tMap = new HashMap<>();
        for (int i = 0; i < sData.length; i++) {
            String item = sData[i];
            if (!sMap.containsKey(item)) {
                sMap.put(item, 1);
            } else {
                int val = sMap.get(item) + 1;
                sMap.put(item,val);
            }
        }
        for (int j = 0; j < tData.length; j++) {
            String item = tData[j];
            if (!tMap.containsKey(item)) {
                tMap.put(item, 1);
            } else {
                int val = tMap.get(item) + 1;
                tMap.put(item,val);
            }
        }

        if (sMap.size() != tMap.size()) return false;

        for (String key: sMap.keySet()) {
            if (!sMap.get(key).equals(tMap.get(key))) {
                return false;
            }
        }
        return true;
    }
}
