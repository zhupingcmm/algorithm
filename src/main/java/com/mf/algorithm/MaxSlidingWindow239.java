package com.mf.algorithm;

import java.util.LinkedList;

public class MaxSlidingWindow239 {
    public static void main(String[] args) {
        MaxSlidingWindow239 maxSlidingWindow239 = new MaxSlidingWindow239();
        int [] result = maxSlidingWindow239.maxSlidingWindow(new int[]{7,2,4}, 2);
        System.out.println(result);
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int [] result = new int[nums.length - k + 1];
        LinkedList<Integer> queue = new LinkedList<>();
        for (int right = 0; right < nums.length; right++) {
            while (!queue.isEmpty() && nums[right] >= nums[queue.peekLast()]) {
                queue.removeLast();
            }

            queue.offer(right);

            int left = right - k + 1;
            if (queue.peekFirst() < left) {
                queue.removeFirst();
            }

            if (right + 1 > k) {
                result[left] = nums[queue.peekFirst()];
            }
        }

        return result;

    }
}
