package com.mf.algorithm;

public class Jump45 {

    public int jump(int[] nums) {
        int cur = 0;
        int next = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            next = Math.max(next, nums[i] + i);
            if (cur == i) {
                if (cur >= nums.length -1) break;
                cur = next;
                result++;
            }
        }
        return result;
    }
}
