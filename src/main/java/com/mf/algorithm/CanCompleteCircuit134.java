package com.mf.algorithm;

public class CanCompleteCircuit134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int sum = 0;
        int totalSum = 0;
        for (int i = 0; i < gas.length; i++) {
            int item = gas[i] - cost[i];

            sum += item;
            totalSum += item;
            if (sum < 0) {
                start = i + 1;
                sum =0;
            }
        }

        if (totalSum < 0) return -1;
        return start;
    }
}
