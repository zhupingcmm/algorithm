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
        while (count++ <= index) {
            cur = cur.next;
        }
        size++;
        return  cur.val;
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        ListNode pre = dummyNode;
        ListNode cur = dummyNode.next;
        pre.next = node;
        node.next = cur;
        size++;

    }

    public void addAtTail(int val) {
        ListNode cur = dummyNode.next;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new ListNode(val);
        size++;
    }

    public void addAtIndex(int index, int val) {
        ListNode node = new ListNode(val);
        ListNode cur = dummyNode.next;
        int count = 0;
        while (count++ <index) {
            cur = cur.next;
        }
        node.next = cur.next;
        cur.next = node;
        size--;

    }

    public void deleteAtIndex(int index) {

        ListNode cur = dummyNode.next;
        int count = 0;
        while (count++ <= index) {
            cur = cur.next;
        }

        cur.next = cur.next.next;

        size--;
    }
}
