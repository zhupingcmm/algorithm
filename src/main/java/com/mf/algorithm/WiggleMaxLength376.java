package com.mf.algorithm;

public class WiggleMaxLength376 {

    public int wiggleMaxLength(int[] nums) {
        int result = 1;
        if (nums.length == 1) return result;

        int preDiff = 0;
        int curDiff = 0;

        for (int i = 1; i < nums.length; i++) {
            // 当前 差值
            curDiff = nums[i] - nums[i -1];
            if ((preDiff >= 0 && curDiff <0) || (preDiff <= 0 && curDiff > 0)) {
                // 当前差值和 先前差值不同才能 result++
                result++;
                // 只有 pre diff 和 cur diff 相反的时候 pre diff 才能被赋值
                preDiff = curDiff;
            }

        }

        return result;
    }
}
