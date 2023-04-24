package com.mf.algorithm;

public class RemoveElements203 {
    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyNode = new ListNode(-1, head);
        ListNode pre = dummyNode;
        ListNode cur = head;

        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }

            cur = cur.next;
        }
        return dummyNode.next;
    }
}
