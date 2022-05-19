package com.luv2code.logicmojo.BinaryTree;

/*
                13
               /   \
             14     20
            /  \    /   \
           25   16  22     28

           25-14-13-20-28
 */
public class BinaryTreeToDoubleLinkList {

    static BinaryTree head = null;
    static BinaryTree tail = null;

    public static void main(String[] ar) {
        BinaryTree root = new BinaryTree(13);
        root.leftNode = new BinaryTree(14);
        root.leftNode.leftNode = new BinaryTree(25);
        root.leftNode.rightNode = new BinaryTree(16);
        root.rightNode = new BinaryTree(20);
        root.rightNode.rightNode = new BinaryTree(28);
        root.rightNode.leftNode = new BinaryTree(22);

        convertToDLL(root);
        display();
    }


    private static void convertToDLL(BinaryTree node) {
        if (node == null)
            return;

        convertToDLL(node.leftNode);
        if (head == null && tail == null) {
            head = node;
        } else {
            tail.rightNode = node;
            node.leftNode = tail;

        }
        tail = node;
        convertToDLL(node.rightNode);

    }

    //25->14->16->13->22->20->28
    private static void display() {
        BinaryTree current = head;
        while (current != null) {
            System.out.print(current.data+",");
            current = current.rightNode;
        }
    }
}
