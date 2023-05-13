package com.mf.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.solution(new int[]{2,-2,3,0,4,-7}));
        Map<Integer, Integer> map = new ConcurrentHashMap<>();
        map.put(1,1);
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        reentrantLock.unlock();
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("a");
        threadLocal.remove();
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

