package com.mf.algorithm;

public class SearchMatrix74 {
    public static void main(String[] args) {
        SearchMatrix74 searchMatrix74 = new SearchMatrix74();
        searchMatrix74.searchMatrix(new int[][]{}, 3);
    }
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length - 1;
        int n = 0;
        while (m>=0 && n < matrix[0].length){
            int res = matrix[m][n];
            if (res == target){
                return true;
            } else if (target < res){
                m--;
            } else {
                n++;
            }
        }
        return false;
    }
}
