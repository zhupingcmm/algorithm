package com.mf.algorithm;

//10.03
public class Search10 {
    public static void main(String[] args) {
        Search10 search10 = new Search10();
        search10.search(new int[]{15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14}, 5);
    }

    public int search (int [] arr, int target) {
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                result = i;
                break;
            }
        }
        return result;
    }
}
