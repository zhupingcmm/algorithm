package com.mf.algorithm;

public class SelectionSort {

    public static void main(String[] args) {

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(new int[]{2,4,1,8,10});
    }
    public int[]selectionSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr;
    }
}
