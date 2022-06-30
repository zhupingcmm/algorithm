package com.mf.algorithm;

import java.util.Map;

public class MaxArea11 {
    public static void main(String[] args) {
        MaxArea11 maxArea11 = new MaxArea11();
        int max = maxArea11.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        System.out.println(max);

    }

    // n^2
//    public int maxArea(int [] height) {
//        int max = 0;
//        for (int i = 0; i < height.length; i++) {
//            for (int j = i + 1; j < height.length; j++) {
//                int area  = Math.min(height[i], height[j]) * (j-i);
//                max = Math.max(area, max);
//            }
//        }
//
//        return max;
//    }
    // o(n)
    public int maxArea(int[] height) {
       int left = 0;
       int right = height.length -1;
       int max = 0;
       while (left < right) {
           int minHeight = height[left] < height[right] ? height[left++] : height[right--];
           max = Math.max((right - left + 1) * minHeight, max);
       }

       return max;
    }
}
