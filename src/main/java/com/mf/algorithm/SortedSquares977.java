package com.mf.algorithm;

public class SortedSquares977 {
    public static void main(String[] args) {
        SortedSquares977 sortedSquares977 = new SortedSquares977();
        System.out.println(sortedSquares977.sortedSquares(new int[]{-4,-1,0,3,10}));
    }
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        int len = right;
        int [] result = new int[len +1];
        while (left <= right) {
            int leftSqu = nums[left]*nums[left];
            int rightSqu = nums[right]*nums[right];

            if (leftSqu <= rightSqu) {
                result[len--] = rightSqu;
                right--;
            } else {
                result[len--] = leftSqu;
                left++;
            }
        }

        return result;

    }
}
