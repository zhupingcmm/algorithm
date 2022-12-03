package com.mf.algorithm;

import java.util.Arrays;

public class GenerateMatrix59 {
    public static void main(String[] args) {

        GenerateMatrix59 generateMatrix59 = new GenerateMatrix59();
        int [][] res = generateMatrix59.generateMatrix(3);
        System.out.println(res.toString());

    }

    public int[][] generateMatrix(int n) {
        int offset = 0;
        int start = 0;
        int [][] result = new int[n][n];
        int count = 1;
        int i,j;
        while (offset++ < n / 2) {
            for ( j = start; j < n - offset; j++) {
                result[start][j] = count++;
            }

            for (i = start; i < n-offset ; i++) {
                result[i][j] = count++;
            }

            for ( ;j > offset -1 ; j--) {
                result[i][j] = count++;
            }

            for (; i > offset -1 ; i--) {
                result[i][j] = count++;
            }
            start++;
        }

        if (n % 2 == 1) {
            result[start][start] = count;
        }
        return result;
    }
}
