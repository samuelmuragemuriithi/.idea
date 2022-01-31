package com.awesam;

public class CircularLinkedList {

    private ListNode tail;
    public int length;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public CircularLinkedList() {
        this.tail = null;
        this.length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void createCLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;
        tail = fourth;

    }

    public void display() {
        if (tail == null) return;
        ListNode first = tail.next;
        while (first != tail) {
            System.out.print(first.data + "->");
            first = first.next;
        }
        System.out.println(first.data);
    }

    public static void main(String[] args) {
   CircularLinkedList cll= new CircularLinkedList();
   cll.createCLinkedList();
   cll.display();
    }
}