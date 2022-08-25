package com.mf.algorithm;
import java.util.HashMap;

public class FindTheDifference389 {
    public static void main(String[] args) {
        FindTheDifference389 findTheDifference389 = new FindTheDifference389();
        char result = findTheDifference389.findTheDifference( "a", "aa");
        System.out.println(result);
    }

    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        for (int i = 0; i < t.length(); ++i) {
            char ch = t.charAt(i);
            if (map.containsKey(ch)) {
                if (map.get(ch) == 0) return ch;
               int value = map.get(ch);
               map.put(ch, value - 1);
            } else {
                return ch;
            }
        }
        return ' ';
    }
}
