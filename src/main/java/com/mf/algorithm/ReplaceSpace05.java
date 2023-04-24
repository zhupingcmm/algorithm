package com.mf.algorithm;

public class ReplaceSpace05 {
    public String replaceSpace(String s) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (String.valueOf(s.charAt(i)).equals(" ")) {
                    sb.append("%20");
                } else {
                    sb.append(s.charAt(i));
                }
            }

            return sb.toString();
    }
}
