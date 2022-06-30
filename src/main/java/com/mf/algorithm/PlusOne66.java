package com.mf.algorithm;

public class PlusOne66 {
    public static void main(String[] args) {

        PlusOne66 plusOne66 = new PlusOne66();
        int [] result = plusOne66.plusOne(new int[]{ 9,9,9});
        System.out.println(result);
    }

    public int[] plusOne(int [] digits) {
        int len = digits.length;
        for (int i = len -1; i >= 0 ; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[len + 1];
        digits[0] =1;
        return digits;
    }
}
