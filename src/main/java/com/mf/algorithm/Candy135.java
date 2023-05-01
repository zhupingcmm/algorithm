package com.mf.algorithm;

import java.util.Arrays;

public class Candy135 {

    public static void main(String[] args) {
        Candy135 candy135 = new Candy135();
        System.out.println(candy135.candy(new int[]{1,2,87,87,87,2,1}));
    }

    public int candy(int[] ratings) {

        int [] candy =  new int[ratings.length];
        Arrays.fill(candy, 1);

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i-1]) {
                candy[i] = candy[i - 1] + 1;
            }
        }

        for (int i = ratings.length - 2; i >= 0 ; i--) {
            if (ratings[i] > ratings[i+1]) {
                candy[i] = Math.max(candy[i+1] + 1, candy[i]);
            }
        }

        int sum = 0;
        for (int i = 0; i < candy.length; i++) {
            sum += candy[i];
        }

        return sum;

    }

}
