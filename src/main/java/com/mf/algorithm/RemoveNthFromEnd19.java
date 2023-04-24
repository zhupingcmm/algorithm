package com.mf.algorithm;

public class RemoveNthFromEnd19 {
    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(-1, head);


        ListNode fast = dummyNode;
        ListNode slow = dummyNode;
        while (n-- >= 0) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return dummyNode.next;

    }
}
