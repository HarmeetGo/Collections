package com.company;

public class LinkedList {

   private Node head;//head of the list
   private Node tail;
   private int size=0;

    static class Node{

        int data;
        Node next;

        // Constructor to create a new node
        // Next is by default initialized as null
        Node(int d){
            data=d;
        }
    }

    //returning the size of the list
    public int size(){
        return size;
    }

    // checking if list is empty or not
    public boolean isEmpty(){
        return size==0;
    }

    //adding element at first
    public  void addFirst(int d){
        Node newNode= new Node(d);

        if(isEmpty()) {                   //if empty then make newnode as head
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next =head;
            head = newNode;
        }
        size++;                        //increasing size after adding
    }

    //adding element at last
    public void addLast(int d){
     Node newNode=new Node(d);
     if(isEmpty()){
         head=newNode;
         tail=newNode;
     }
     else{
         tail.next=newNode;            // adding to the next of last element
         tail=newNode;                 // keeping tail as the last element
     }
     size++;                           //increasing size after adding
    }

    //removing the first element
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Nothing to remove");
        }
        else{
            head=head.next;
            size--;
            if(isEmpty()){
                tail=null;
            }
        }
    }

    //removing the last element
    public void removeLast(){
        if(isEmpty()){
            System.out.println("Nothing to remove");
        }
        else{
            if(head.next==null){
                head=null;
                tail=null;
            }
            else {
                Node temp = head;
                while (temp.next.next != null) {     //traversing till the second last element
                    temp = temp.next;
                }
                temp.next = null;
            }
            size--;
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
        LinkedList l=new LinkedList();
        l.addFirst(2);
        l.addLast(3);
        l.addFirst(1);
        l.addLast(4);
        l.addLast(5);
        l.addLast(6);
        l.print();
        System.out.println("size of the list is =" + l.size());
        l.removeLast();
        l.removeFirst();
        l.print();
        System.out.println("size of the list is =" + l.size());
        System.out.println(l.search(4));
    }
}
