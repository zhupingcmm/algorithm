package com.mf.algorithm;

public class ReverseBetween92 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        ReverseBetween92 reverseBetween = new ReverseBetween92();
        reverseBetween.reverseBetween(node, 2, 4);

    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode node = head;
        ListNode cacheNode = null;
        int count = 1;
        while (node != null) {
            if (count == left) {
                ListNode curNode = node;
                ListNode preNode = cacheNode;
                int len = right - left + 1;
                while (len > 0) {
                    ListNode temp = node.next;
                    node.next = preNode;
                    preNode = curNode;
                    curNode = temp;
                    len--;
                }
                node.next = preNode;
                break;
            }
            cacheNode = node;
            node = node.next;
            count ++;
        }
        return cacheNode;
    }

}
