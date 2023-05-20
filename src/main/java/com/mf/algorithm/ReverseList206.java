package com.mf.algorithm;


public class ReverseList206 {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode tem = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tem;
        }

        return pre;
    }

}
