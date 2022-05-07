package com.company;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size=0;
    class Node {
        int data;
        Node next;
        Node prev;

        //Creating a constructor for initializing
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    //size
    public int size(){
        return size;
    }

    //empty or not
    public boolean isEmpty(){
        return size==0;
    }
    //adding element at first
    public void addFirst(int d) {
        Node newNode = new Node(d);

        //If list is empty
        if(isEmpty()) {
            //head and tail both will point to newNode
            head = newNode;
            tail = newNode;
            head.prev = null;
            tail.next = null;
        }
        else {
            head.prev = newNode;
            newNode.next = head;
            newNode.prev = null;
            head = newNode;
        }
        size++;                 //increasing size after adding
    }

    //adding element at last
    public void addLast(int d){
        Node newNode = new Node(d);
        if(isEmpty()){
            //head and tail both will point to newNode
            head = newNode;
            tail = newNode;
            head.prev = null;
            tail.next = null;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
        size++;                 //increasing size after adding
    }

    //removing element from front
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("empty");
        }
        else{
            head=head.next;
            head.prev=null;
            size--;
            if(isEmpty()){
                tail=null;
            }
        }
    }

    //removing element from last
    public void removeLast(){
        if(isEmpty()){
            System.out.println("empty");
        }
        else{
            tail=tail.prev;
            tail.next=null;
            size--;
            if(isEmpty()){
                head=null;
            }
        }
    }

    //searching an element
    public int search(int d){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==d){
                return i;
            }
            i++;
            temp=temp.next;
        }
        return -1;        //if the element not present in the list return -1;
    }

    //printing all elements
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DoublyLinkedList d=new DoublyLinkedList();
        d.addFirst(2);
        d.addLast(3);
        d.addFirst(1);
        d.print();
        System.out.println("element is at " + d.search(3)+ " index");
        System.out.println(d.size());
        System.out.println(d.isEmpty());
        d.addLast(4);
        d.removeFirst();
        d.print();
        System.out.println(d.size());
    }
}
