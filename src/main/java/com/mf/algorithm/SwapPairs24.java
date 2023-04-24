package com.mf.algorithm;


import java.util.List;

public class SwapPairs24 {
    public static void main(String[] args) {
    }
    public ListNode swapPairs(ListNode head) {

        ListNode dummyNode = new ListNode(-1, head);

        ListNode pre = dummyNode;
        ListNode cur = head;

        while (pre.next != null && pre.next.next != null) {
            ListNode tem = cur.next.next;
            pre.next = cur.next;
            cur.next.next = cur;
            cur.next = tem;
            pre = cur;
            cur = tem;
        }
        return dummyNode.next;
    }
}
