package com.mf.algorithm;


public class SwapPairs24 {
    public static void main(String[] args) {
    }
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        while (pre.next != null && pre.next.next != null) {
            ListNode tem = cur.next.next;
            pre.next = cur.next;
            cur.next.next = cur;
            cur.next = tem;
            pre = cur;
            cur = tem;
        }

        return dummy.next;
    }
}
