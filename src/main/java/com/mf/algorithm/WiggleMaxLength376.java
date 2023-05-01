package com.mf.algorithm;

public class WiggleMaxLength376 {
    public static void main(String[] args) {
        WiggleMaxLength376 wiggleMaxLength376 = new WiggleMaxLength376();
        System.out.println(wiggleMaxLength376.wiggleMaxLength(new int[]{1,17,5,10,13,15,10,5,16,8}));
    }

    public int wiggleMaxLength(int[] nums) {
        int result = 1;
        if (nums.length == 1) return result;

        int preDiff = 0;
        int curDiff = 0;

        for (int i = 1; i < nums.length; i++) {
            // 计算出 curDiff
            curDiff = nums[i] - nums[i-1];
            // 如果 preDiff 和 curDiff 是相反的方向，则说明满足摆动条件
            if ((preDiff >=0 && curDiff < 0) || (preDiff <= 0 && curDiff > 0)) {
                result++;
                preDiff = curDiff;
            }
        }

        return result;

    }
}
