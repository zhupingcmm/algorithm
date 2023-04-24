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

        ListNode fast = head;
        ListNode slow = head;
        ListNode index1 = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode index2 = fast;
                while (index2 != index1) {
                    index2 = index2.next;
                    index1 = index1.next;
                }

                return index1;
            }
        }

        return null;
    }
}
