package com.mf.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Intersection {

    public static void main(String[] args) {
        int [] nums1 = new int[]{4,9,5};
        int [] nums2 = new int[]{9,4,9,8,5};
        Intersection intersection = new Intersection();
        int [] result =  intersection.intersection(nums1, nums2);
        System.out.println(result);

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int k : nums1) {
            set1.add(k);
        }

        for (int j : nums2) {
            set2.add(j);
        }
        HashSet<Integer> intersectionSet = new HashSet<>();

        int index = 0;
        for (int item : set1) {
            if (set2.contains(item)) {
                intersectionSet.add(item);
            }
        }
        int [] result = new int[intersectionSet.size()];
        for (int item: intersectionSet) {
            result[index++] = item;
        }

        return result;
    }
}
