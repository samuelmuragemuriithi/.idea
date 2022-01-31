package com.awesam;

public class CircularLinkedList2 {
    private ListNode tail;
    private int length;
    private class ListNode{
        private ListNode next;
        private int data;
        public ListNode (int data){
            this.data=data;
        }
    }
    public CircularLinkedList2(){
        this.tail=null;
        this.length=0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
      return  length==0;
    }
    public void createCLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode forth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        first.next=second;
        second.next=third;
        third.next=forth;
        forth.next= fifth;
        fifth.next=first;
        tail = fifth;
    }
    public void createCLinkedList2() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
       ListNode fourth = new ListNode(4);
       ListNode fifth = new ListNode(5);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next=first;
        tail = fifth;

    }
    public void print(){
        if (tail==null)return;
        ListNode first = tail.next;
        while (first!=tail){
            System.out.print(first.data+"->");
            first=first.next;
        }
        System.out.println(first.data);
    }

    public static void main(String[] args) {
        CircularLinkedList2 cll2= new CircularLinkedList2();
        cll2.createCLinkedList();
        cll2.print();
    }
}
