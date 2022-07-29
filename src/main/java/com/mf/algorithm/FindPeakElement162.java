package com.mf.algorithm;

public class FindPeakElement162 {
    public static void main(String[] args) {
        FindPeakElement162 findPeakElement162 = new FindPeakElement162();
        int result = findPeakElement162.findPeakElement(new int[]{1,2});
        System.out.println(result);
    }

    public int findPeakElement(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (i == nums.length -1) {
                if (nums[i] > nums[i-1]) {
                    return i;
                }
                break;
            }
            if (nums[i] > nums[i-1] && nums[i]> nums[i+1]) {
                return i;
            }
        }
        return 0;
    }
}
