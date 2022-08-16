package com.mf.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NumDecodings91 {
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        NumDecodings91 numDecodings91 = new NumDecodings91();
        numDecodings91.numDecodings("12");

    }

    public int numDecodings(String s) {

        for (int i = 0; i < s.length() ; i++) {
            System.out.println(s.charAt(i));
        }
        return 1;
    }


//    public void quick(int level, String s, List<String> result){
//        if (level == s.length()) {
//            result.add();
//            return;
//        }
//
//        quick(level + 1, s + );
//    }
}
