package com.company;

public class Stack {
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

    //adding element
    public void push(int d){
        Node node=new Node(d);
        node.next=head;
        head=node;
        size++;
    }

    //removing element
    public int pop(){
        if(head==null){
            return -1;
        }
        else{
            int a=head.data;
            head=head.next;
            size--;
            return a;
        }
    }

    //return top most element
    public int top() {

        if(head==null)
            return -1;
        else
            return head.data;
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
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.print();
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
    }
}
