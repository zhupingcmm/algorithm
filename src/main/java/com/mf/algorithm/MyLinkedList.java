package com.mf.algorithm;

public class MyLinkedList {

    private ListNode dummy;
    private int size;

    public MyLinkedList() {
        dummy = new ListNode(0);
        size = 0;
    }


    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        ListNode cur = dummy;
        int i = 0;
        while (i++ <= index) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        ListNode cur = dummy;
        node.next = cur.next;
        cur.next = node;
        size++;
    }

    public void addAtTail(int val) {
        ListNode node = new ListNode(val);
        ListNode cur = dummy;
        for (int i = 0; i < size; i++) {
            cur = cur.next;
        }
        cur.next = node;
        size++;

    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
        }
        ListNode node = new ListNode(val);
        ListNode cur = dummy;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        node.next = cur.next;
        cur.next = node;
        size++;

    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        ListNode cur = dummy;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        size--;
    }
}
