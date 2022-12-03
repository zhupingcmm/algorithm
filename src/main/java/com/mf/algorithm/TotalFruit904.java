package com.mf.algorithm;

import java.util.*;

public class TotalFruit904 {
    public static void main(String[] args) {
        TotalFruit904 totalFruit904 = new TotalFruit904();
        totalFruit904.totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4});
    }

    public int totalFruit(int[] fruits) {
        int left = 0;
        int result = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for (int right = 0; right < fruits.length; right++) {
            result = Math.max(right - left + 1, result);
            set.add(fruits[right]);
            //移动左指针
            if (set.size()>= 2) {
                int leftFruit =fruits[left];
                while (left < right) {
//                    if (){
//
//                    }
                }
            }
        }

        return result == Integer.MIN_VALUE ? 0 : result;

    }
}
