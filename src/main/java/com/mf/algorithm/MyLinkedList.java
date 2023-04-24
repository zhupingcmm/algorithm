package com.mf.algorithm;

public class MyLinkedList {


    ListNode dummyNode;
    int size = 0;

    public MyLinkedList() {
        dummyNode = new ListNode(-1);
    }

    public int get(int index) {
        int count = size;
        ListNode cur = dummyNode.next;
        while (count++>=index) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        ListNode cur = dummyNode.next;
        ListNode pre = dummyNode;
        pre.next = node;
        node.next = cur;
        size++;
    }

    public void addAtTail(int val) {
        ListNode cur =dummyNode.next;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new ListNode(val);
        size++;
    }

    public void addAtIndex(int index, int val) {
        int count = 0;
        if (index > size) return;
        ListNode cur = dummyNode.next;
        while (count++ <= index) {
            cur = cur.next;
        }

        ListNode node = new ListNode(val);
        ListNode next = cur.next;
        cur.next = node;
        node.next = next;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index > size) return;
        int count =0;
        ListNode pre = dummyNode;
        ListNode cur = dummyNode.next;
        while (count++ <= index) {

            cur = cur.next;
        }
        cur.next = cur.next.next;
        size--;
    }
}
