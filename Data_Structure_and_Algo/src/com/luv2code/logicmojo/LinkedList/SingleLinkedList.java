package com.luv2code.logicmojo.LinkedList;

class Node {
    public int data;
    public Node nextNode;

    Node() {
    }

    //when ever we create instance of this class we will have  next pointing to null
    Node(int data) {
        this.data = data;
        this.nextNode = null;
    }




}

public class SingleLinkedList {

    public static void main(String arg[]) {


        SingleLinkedList singleLinkedList = new SingleLinkedList();
        for (int i = 1; i <= 5; i++) {
            singleLinkedList.addNode(i);
        }

        Node node = singleLinkedList.head;
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.nextNode;

        }

        // System.out.println(node5.data+":"+node5.nextNode);
    }

    //for the initial node both of them will be empty
    public Node head = null;
    public Node tail = null;

    public void addNode(int val) {
        Node node = new Node(val);
        //if we are inserting after first node both will point to new node
        if (head == null) {
            head = node;
        } else {
            tail.nextNode = node;
        }
        tail = node;
    }
}
