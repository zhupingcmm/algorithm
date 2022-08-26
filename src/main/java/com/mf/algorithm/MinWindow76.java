package com.mf.algorithm;

import java.util.LinkedList;

public class MinWindow76 {
    public static void main(String[] args) {

    }

    public String minWindow(String s, String t) {
        LinkedList<Character> queue = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            boolean match = isMatch(queue, t);
            if (match) {

                boolean in = false;
                for (int j = 0; j < t.length(); j++) {
                    if (t.charAt(j) == item) {
                        in = true;
                        break;
                    }
                }
                if (in) {

                }

            }
            queue.add(item);
        }

        return "";

    }

    private boolean isMatch (LinkedList<Character> queue, String t) {
        boolean match = true;
        for (int j = 0; j < t.length(); j++) {
            if (!queue.contains(t.charAt(j))) {
                match = false;
                break;
            }
        }
        return match;
    }
}
