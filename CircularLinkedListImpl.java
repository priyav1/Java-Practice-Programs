package com.priya.datastructuresandalgorithms.linkedlist;

/**
 * Created by priya on 05/08/18.
 */
public class CircularLinkedListImpl {
    public static void main(String args[]){
        CircularLinkedList circularList = new CircularLinkedList();
        circularList.insertFirst(200);
        circularList.insertFirst(201);
        circularList.insertLast(202);
        circularList.insertLast(203);
        circularList.displayList();
    }
}
