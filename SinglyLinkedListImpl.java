package com.priya.datastructuresandalgorithms.linkedlist;

/**
 * Created by priya on 05/08/18.
 */
public class SinglyLinkedListImpl {
    public static void main(String args[]){
        SinglyLinkedList singleList = new SinglyLinkedList();
        singleList.insertFirst(100);
        singleList.insertFirst(101);
        singleList.insertLast(102);
        singleList.insertLast(103);
        singleList.displayList();
    }
}
