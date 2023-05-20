package com.mf.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CommonChars1002 {
    public List<String> commonChars(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        int len = words.length;
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            for (int j = 0; j < str.length(); j++) {
                Character key = str.charAt(j);
                if (map.containsKey(key)) {
                    int val = map.get(key) + 1;
                    if (val == len) {
                        result.add(key.toString());
                        map.put(key, 0);
                    } else {
                        map.put(key, val);
                    }
                } else {
                    map.put(key, 1);
                }

            }
        }

        return result;

    }
}
