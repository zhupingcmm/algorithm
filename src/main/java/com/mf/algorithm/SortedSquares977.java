package com.mf.algorithm;

public class SortedSquares977 {
    public static void main(String[] args) {
        SortedSquares977 sortedSquares977 = new SortedSquares977();
        sortedSquares977.sortedSquares(new int[]{-4,-1,0,3,10});
    }
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int len = nums.length -1;
        int right = len;

        int [] result = new int[len + 1];
        while (left <= right) {
            int leftRes = nums[left] * nums[left];
            int rightRes = nums[right] * nums[right];
            if (leftRes > rightRes) {
                result[len--] = leftRes;
                left++;
            } else if (leftRes < rightRes) {
                result[len--] = rightRes;
                right--;
            } else {
                result[len--] = leftRes;
                left++;
            }
        }

        return result;
    }
}
