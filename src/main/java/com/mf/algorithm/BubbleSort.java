package com.mf.algorithm;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int [] result = bubbleSort.bubbleSort(new int[]{1,9,7,8});
        System.out.println(result);

    }
    public int [] bubbleSort (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -i -1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
