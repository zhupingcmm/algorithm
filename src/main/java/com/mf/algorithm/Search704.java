package com.mf.algorithm;

public class Search704 {
    public static void main(String[] args) {
        Search704 search701 = new Search704();
        int result = search701.search(new int[]{-1,0,3,5,9,12}, 9);
        System.out.println(result);
    }

    public int search(int[] nums, int target) {

       int left = 0;
       int right = nums.length -1;
       while (left <= right) {
           int mid = (left  + right) / 2;
           int item = nums[mid];
           if (item > target) {
               right = mid - 1;
           } else if (item < target) {
               left = mid + 1;
           } else {
               return mid;
           }
       }

        return -1;


    }
}
