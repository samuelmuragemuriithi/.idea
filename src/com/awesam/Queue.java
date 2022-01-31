package com.awesam;

public class Queue {
    private ListNode front;
    private ListNode rear;
    private int length;
    private class ListNode{
        private ListNode next;
        private int data;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Queue(){
        this.front=null;
        this.rear=null;
        this.length=0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void enqueue(int value){
        ListNode temp = new ListNode(value);
        if (isEmpty())front=temp;
        else rear.next=temp;
        rear=temp;
        length++;
    }
    public void display(){
        ListNode current = front;
        while (current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.print("null");

    }

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.display();

    }
}
