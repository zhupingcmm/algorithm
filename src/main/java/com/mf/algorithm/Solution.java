package com.mf.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.solution(new int[]{10, 1, 3, 1, 2, 2, 1, 0, 4});

    }

    public int solution(int[] A) {
        // write your code in Java SE 8

        int result = 0;
        if (A.length <=1 ) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length -1 ; i++) {
          int j = i + 1;
            int key =  A[i] + A[j];
            if (map.containsKey(key)){
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        return map.values().stream().max((a,b) -> a.compareTo(b)).get();
//        for (Integer key : map.keySet()) {
//            if (maxValue == map.get(key)){
//                result = key;
//                break;
//            }
//        }
//        return result;
    }
}
