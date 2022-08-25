package com.mf.algorithm;

import java.util.HashMap;

public class WordPattern290 {
    public static void main(String[] args) {
        WordPattern290 wordPattern290 = new WordPattern290();
        wordPattern290.wordPattern("abab", "dog cat cat dog");
    }
    public boolean wordPattern(String pattern, String s) {

        String [] arr= s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if(arr[i] != String.valueOf(map.get(pattern.charAt(i)))) {
                    return false;
                }
            }
            map.put(pattern.charAt(i), arr[i]);
        }

        return false;

    }
}
