package com.mf.algorithm;

import java.util.LinkedList;

public class MaxSlidingWindow239 {
    public static void main(String[] args) {
        MaxSlidingWindow239 maxSlidingWindow239 = new MaxSlidingWindow239();
        int [] result = maxSlidingWindow239.maxSlidingWindow(new int[]{7,2,4}, 2);
        System.out.println(result);
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int length = nums.length;
        int [] result = new int[length - k + 1];
        // 队列中存储的是 nums 的索引， 而且要保持 队列头部索引对应的值是队列中最大的值
        LinkedList<Integer> queue = new LinkedList<>();
        int index = 0;
        for (int i = 0; i < length; i++) {
            // 往队列尾部添加元素，如果队列尾部的元素小于或者等于将要加入的元素，将尾部元素删除
            // 保证了队列头部元素的最大
            while (!queue.isEmpty() && nums[i] >= nums[queue.peekLast()]) {
                queue.removeLast();
            }
            // 新的元素添加进来，如果头部元素是超出 了 滑动窗口的左边界，那这个元素得被删除掉
            if (!queue.isEmpty() && queue.peekFirst() < i - k + 1) {
                queue.removeFirst();
            }


            queue.add(i);

            if (i >= k - 1) {
                result[index++] = nums[queue.peekFirst()];
            }

        }

        return result;

    }
}
