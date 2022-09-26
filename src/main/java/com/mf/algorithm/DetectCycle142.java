package com.mf.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class DetectCycle142 {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = node;

        DetectCycle142 detectCycle142 = new DetectCycle142();
        detectCycle142.detectCycle(node);
    }
    public ListNode detectCycle(ListNode head) {
        if (head == null && head.next == null) return null;
        ListNode node = head;

        LinkedList<ListNode> queue = new LinkedList<>();
        while (node != null) {
            if (queue.contains(node)){
                return node;
            }

            queue.add(node);
            node = node.next;
        }

        return null;
    }
}
