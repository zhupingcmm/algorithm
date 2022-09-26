package com.mf.algorithm;

import java.util.LinkedList;

public class HasCycle141 {
    public static void main(String[] args) {
        HasCycle141 hasCycle141 = new HasCycle141();
//        hasCycle141.hasCycle()

    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        LinkedList<ListNode> queue = new LinkedList<>();

        ListNode node = head;
        while (node != null) {
            if (queue.contains(node)) {
                return true;
            }

            queue.add(node);
            node = node.next;
        }

        return false;
    }
}
