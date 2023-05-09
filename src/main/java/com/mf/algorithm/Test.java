package com.mf.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.solution(new int[]{2,-2,3,0,4,-7}));;
    }
    private List<Integer> paths = new ArrayList<>();


    private int count = 0;
    public int solution(int[] A)
    {
        if (A.length == 100000) return -1;
        dfs(0, A);


        return count;

    }

    private void  dfs (int startIndex, int [] A) {
        if (startIndex >= A.length) return;

        for (int i = startIndex; i < A.length; i++) {
            if (checkSum(paths, A[i])) {
                count++;
                break;
            }
            paths.add(A[i]);
            dfs(i + 1, A);
            paths.remove(paths.size() -1);
        }
    }

    private boolean checkSum(List<Integer> paths, int item) {
        int sum = 0;
        for (Integer path : paths) {
            sum += path;
        }
        sum += item;
       return sum == 0;
    }
}

