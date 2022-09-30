package com.mf.algorithm;

public class NumIslands200 {
    public static void main(String[] args) {
        NumIslands200 numIslands200 = new NumIslands200();
        char[][]grid = new char[1][7];
        grid[0][0] = '1';
        grid[0][1] = '0';
        grid[0][2] = '1';
        grid[0][3] = '1';
        grid[0][4] = '0';
        grid[0][5] = '1';
        grid[0][6] = '1';


        numIslands200.numIslands(grid);
    }

    public int numIslands(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1'){
                    dfs(i,j,grid);
                    ++count;
                }
            }
        }
        return count;
    }

    private void dfs (int i, int j, char[][] grid) {
        if (i<0 || j<0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') return;
        grid[i][j] = '0';
        dfs(i-1, j, grid);
        dfs(i+1, j, grid);
        dfs(i, j-1, grid);
        dfs(i, j+1, grid);
    }
}
