package com.mf.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequent347 {

    public static void main(String[] args) {
        TopKFrequent347 topKFrequent347 = new TopKFrequent347();
        topKFrequent347.topKFrequent(new int[]{3,0,1,0}, 1);
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((p1, p2) -> p1[1] - p2[1]);

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        for (Integer key : map.keySet()) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(new int[]{key, map.get(key)});
            } else {
                if (!priorityQueue.isEmpty()) {
                    if (map.get(key) > priorityQueue.peek()[1]) {
                        priorityQueue.poll();
                        priorityQueue.add(new int[]{key, map.get(key)});
                    }
                }

            }
        }

        int [] result = new int[k];
        int index = 0;

        while (!priorityQueue.isEmpty()) {
            result[index++] = priorityQueue.poll()[0];
        }

        return result;
    }
}
