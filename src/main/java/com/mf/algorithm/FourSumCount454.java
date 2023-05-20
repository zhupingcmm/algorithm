package com.mf.algorithm;

import java.util.HashMap;
import java.util.Map;

public class FourSumCount454 {
    public static void main(String[] args) {
        FourSumCount454 fourSumCount454 = new FourSumCount454();
        fourSumCount454.fourSumCount(new int[]{1,2}, new int[]{-2,-1}, new int[]{-1,2}, new int[]{0,2});

    }
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int key = nums1[i] + nums2[j];
                if (map.containsKey(key)) {
                    map.put(key, map.get(key) +1);
                } else {
                    map.put(key, 1);
                }
            }
        }
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int key = nums3[i] + nums4[j];
                if (map.containsKey(-key)) {

                    result+= map.get(-key);
                }
            }
        }
        return result;
    }
}
