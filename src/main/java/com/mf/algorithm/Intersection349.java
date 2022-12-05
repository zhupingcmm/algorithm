package com.mf.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Intersection349 {

    public static void main(String[] args) {
        int [] nums1 = new int[]{4,9,5};
        int [] nums2 = new int[]{9,4,9,8,5};
        Intersection349 intersection = new Intersection349();
        int [] result =  intersection.intersection(nums1, nums2);
        System.out.println(result);

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                set2.add(nums2[i]);
            }
        }

        int index = 0;
        int[]result = new int[set2.size()];
        for (int val :set2) {
            result[index++] = val;
        }
        return result;
    }
}
