package com.priya.datastructuresandalgorithms.linkedlist;

/**
 * Created by priya on 05/08/18.
 */
public class SinglyLinkedList {
    private Node first;

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void insertLast(int data){
        Node currentNode = first;
        while(currentNode.next !=null){
            currentNode = currentNode.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        currentNode.next = newNode;
    }

    public void displayList(){
        System.out.println("First to last");
        Node currentNode = first;
        while(currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
    }
}
