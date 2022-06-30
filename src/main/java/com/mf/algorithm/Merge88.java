package com.mf.algorithm;

import java.util.Arrays;

public class Merge88 {
    public static void main(String[] args) {

    }
    private void merge (int[] num1, int m, int [] num2, int n){
        for (int i = 0; i < n; i++) {
            num1[m + i] = num2[i];
        }

        Arrays.sort(num1);
    }
}
