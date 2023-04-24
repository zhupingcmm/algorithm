package com.mf.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class MaxSlidingWindow239 {
    public static void main(String[] args) {
        MaxSlidingWindow239 maxSlidingWindow239 = new MaxSlidingWindow239();
        int [] result = maxSlidingWindow239.maxSlidingWindow(new int[]{7,2,4}, 2);
        System.out.println(result);
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer> queue = new LinkedList<>();

        int len = nums.length;
        int index = 0;
        int [] result = new int[len - k + 1];
        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && nums[i] >= nums[queue.peekLast()]) {
                queue.removeLast();
            }

            if (!queue.isEmpty() && queue.peek() < i -k +1) {
                queue.poll();
            }

            queue.offer(i);


            if (i >= k - 1) {
                result[index++] = nums[queue.peek()];
            }
        }

        return result;
    }
}
