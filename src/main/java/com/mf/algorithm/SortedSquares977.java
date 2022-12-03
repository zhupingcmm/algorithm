package com.mf.algorithm;

public class SortedSquares977 {
    public static void main(String[] args) {
        SortedSquares977 sortedSquares977 = new SortedSquares977();
        sortedSquares977.sortedSquares(new int[]{-4,-1,0,3,10});
    }
    public int[] sortedSquares(int[] nums) {
        int length = nums.length -1;
        int [] result = new int[length + 1];

        int left = 0;
        int right = length;
        while (left<=right) {
            if (nums[left]*nums[left] > nums[right]*nums[right]) {
                result[length--] = nums[left] * nums[left];
                left++;
            } else  {
                result[length--] = nums[right]*nums[right];
                right--;
            }
        }
        return result;
    }
}
