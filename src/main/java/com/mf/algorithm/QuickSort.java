package com.mf.algorithm;

public class QuickSort {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int [] result = quickSort.quickSort(new int[]{9,4,6,2,7,3}, 0, 5);
        System.out.println(result);
    }
    public int[]quickSort(int[]arr, int begin, int end){
        if (end>begin) return arr;
        int pivot = partition(arr, 0, arr.length-1);
        quickSort(arr, begin, pivot -1);
        quickSort(arr, pivot + 1, end);
        return arr;
    }
    private int partition(int[]arr, int begin, int end){
        int pivot = end;
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (arr[i] < arr[pivot]) {
                int temp = arr[counter];
                arr[counter] = arr[i];
                arr[i] = temp;
                counter++;
            }
        }
        int temp = arr[pivot];
        arr[pivot] = arr[counter];
        arr[counter] = temp;
        return counter;
    }
}
