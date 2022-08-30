package com.mf.algorithm;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SortList148 {

    public ListNode sortList(ListNode head) {
        int n = 1;
        ListNode currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            n++;
        }
        PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>(n,new Comparator<ListNode>(){ //大顶堆，容量11
            @Override
            public int compare(ListNode i1,ListNode i2){
                return i1.val - i2.val;
            }
        });

        currentNode = head;
        while (currentNode.next != null) {
            minHeap.add(currentNode);
            currentNode = currentNode.next;
        }

        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = minHeap.peek();

        ListNode pre = dummyNode;
        ListNode cur = null;
        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.remove();
            pre.next = node;


        }

        return dummyNode.next;
    }
}
