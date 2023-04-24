package com.mf.algorithm;

import java.util.HashMap;
import java.util.Map;

public class FourSumCount454 {
    public static void main(String[] args) {
        FourSumCount454 fourSumCount454 = new FourSumCount454();
        fourSumCount454.fourSumCount(new int[]{1,2}, new int[]{-2,-1}, new int[]{-1,2}, new int[]{0,2});

    }
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                Integer key = nums1[i] + nums2[j];
                if (map.containsKey(key)) {
                    Integer val = map.get(key);
                    map.put(key, val + 1);
                } else {
                    map.put(key, 1);
                }
            }
        }

        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                Integer key = nums3[i] + nums4[j];
                if (map.containsKey(-key)) {
                    count = count + map.get(-key);
                }
            }
        }

        return count;
    }
}
