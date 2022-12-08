package com.mf.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequent347 {

    public static void main(String[] args) {
        TopKFrequent347 topKFrequent347 = new TopKFrequent347();
        topKFrequent347.topKFrequent(new int[]{1,1,1,2,2,3}, 2);
    }
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        Queue<int[]> priorityQueue= new PriorityQueue<>((p1, p2) -> p1[1] - p2[1]);
        int [] result = new int[k -1];
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(new int[]{entry.getKey(), entry.getValue()});
            } else {
                if ( !priorityQueue.isEmpty() && entry.getValue() > priorityQueue.peek()[1]) {
                    priorityQueue.poll();
                    priorityQueue.add(new int[]{entry.getKey(), entry.getValue()});
                }
            }
        }

        for (int i = k -1; i >= 0 ; i--) {
            result[i] = priorityQueue.poll()[0];
        }


        return result;


    }
}
