package com.mf.algorithm;

import java.util.HashMap;
import java.util.Map;

public class FourSumCount454 {
    public static void main(String[] args) {

    }
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int key = nums1[i] + nums2[j];

                if (map.containsKey(key)) {
                    int value = map.get(key);
                    map.put(key, value + 1);
                } else {
                    map.put(key, 1);
                }
            }
        }

        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int key = nums3[i] + nums4[j];
                if (map.containsKey(-key)) {
                     result += map.get(-key);
                }
            }
        }


        return result;
    }
}
