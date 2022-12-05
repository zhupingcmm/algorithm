package com.mf.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Intersection349 {

    public static void main(String[] args) {
        int [] nums1 = new int[]{4,9,5};
        int [] nums2 = new int[]{9,4,9,8,5};
        Intersection349 intersection = new Intersection349();
        int [] result =  intersection.intersection(nums1, nums2);
        System.out.println(result);

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            Integer key = nums1[i];
            map.putIfAbsent(key, 1);
        }
        for (int i = 0; i < nums2.length ; i++) {
            if (map.containsKey(nums2[i])) {
                set.add(nums2[i]);
            }
        }

        int [] result = new int[set.size()];
        int index = 0;
        for (int val : set) {
            result[index++] = val;
        }
        return result;
    }
}
