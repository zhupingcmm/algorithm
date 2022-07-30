package com.mf.algorithm;

public class SearchMatrix74 {
    public static void main(String[] args) {
        SearchMatrix74 searchMatrix74 = new SearchMatrix74();
        searchMatrix74.searchMatrix(new int[][]{}, 3);
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int x = 0;
        int y = matrix.length -1;
       while (y >= 0 && x < matrix[0].length){
           int num = matrix[y][x];
           if (num == target) {
               return true;
           } else if (num > target){
               y --;
           } else {
               x ++;
           }
       }
       return false;
    }
}
