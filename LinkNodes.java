package com.priya.datastructuresandalgorithms.linkedlist;

/**
 * Created by priya on 05/08/18.
 */
public class LinkNodes {

    public static void main(String args[]){
        Node nodeA = new Node();
        nodeA.data = 4;

        Node nodeB = new Node();
        nodeB.data = 3;
        nodeA.next  = nodeB;

        Node nodeC = new Node();
        nodeC.data = 7;
        nodeB.next = nodeC;

        Node nodeD = new Node();
        nodeD.data = 8;
        nodeC.next = nodeD;

        System.out.println(listLength(nodeD));

    }

    public static int listLength(Node node){
        int count = 0;
        Node currentNode = node;
        while(currentNode != null){
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }
}
