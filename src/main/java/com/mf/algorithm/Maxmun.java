package com.mf.algorithm;

public class Maxmun {
    public static void main(String[] args) {
        int count = 0;
        int res = 4301;
        while (res > 10) {
            res = res / 10;
            count++;
        }


        System.out.println(res);
        System.out.println(count);
    }

//    public int maximunDiff(int num) {
//        if (num == 0) return 45;
//        if(num > 0) {
//            int count = getNum(num);
//            Math.pow(10, count) * 5
//        }
//
//    }

    private int getNum (int num) {
        int count = 0;
        int res = Math.abs(num);
        while (res > 10) {
            res = res / 10;
            count++;
        }
        return count;
    }
}
