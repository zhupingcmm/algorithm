package com.mf.algorithm;

public class SortedSquares977 {
    public static void main(String[] args) {
        SortedSquares977 sortedSquares977 = new SortedSquares977();
        sortedSquares977.sortedSquares(new int[]{-4,-1,0,3,10});
    }
    public int[] sortedSquares(int[] nums) {
        int len = nums.length -1;
        int [] result = new int[nums.length];

        int left = 0;
        int right = len;
        while (left <= right) {
            int lRes = nums[left] * nums[left];
            int rRes = nums[right] * nums[right];
            if (lRes < rRes) {
                result[len--] = rRes;
                right--;
            } else  {
                result[len--] = lRes;
                left++;
            }
        }

        return result;

    }
}
