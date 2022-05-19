package com.luv2code.logicmojo.BinaryTree;

/* create the below binary tree first
            13
         /     \
        10      18
      /   \        \
      8   12        20
          / \
         11  16
        */
public class Pre_Post_In_order_BinaryTreeProblem {
    public static void main(String[] ar) {
        BinaryTree rootNode = new BinaryTree();
        rootNode.data = 13;
        //left sub tree
        rootNode.leftNode = new BinaryTree(10);
        rootNode.leftNode.leftNode = new BinaryTree(8);
        rootNode.leftNode.rightNode = new BinaryTree(12);
        rootNode.leftNode.rightNode.leftNode = new BinaryTree(11);
        rootNode.leftNode.rightNode.rightNode = new BinaryTree(16);

        //right sub tree
        rootNode.rightNode = new BinaryTree(18);
        rootNode.rightNode.rightNode = new BinaryTree(20);
        displayBinaryTreePostOrder(rootNode);
        System.out.println();
        displayBinaryTreePreOrder(rootNode);
        System.out.println();
        displayBinaryTreeInOrder(rootNode);


    }

    //8,11,16,12,10,20,18,13
    static void displayBinaryTreePostOrder(BinaryTree rootNode) {
        if (rootNode == null)
            return;
        displayBinaryTreePostOrder(rootNode.leftNode);
        displayBinaryTreePostOrder(rootNode.rightNode);
        System.out.print(rootNode.data + ",");
    }

    //13,10,8,12,11,16,18,20
    static void displayBinaryTreePreOrder(BinaryTree rootNode) {
        if (rootNode == null)
            return;
        System.out.print(rootNode.data + ",");
        displayBinaryTreePreOrder(rootNode.leftNode);
        displayBinaryTreePreOrder(rootNode.rightNode);

    }

    //8,10,11,12,16,13,18,20
    static void displayBinaryTreeInOrder(BinaryTree rootNode) {
        if (rootNode == null)
            return;

        displayBinaryTreeInOrder(rootNode.leftNode);
        System.out.print(rootNode.data + ",");
        displayBinaryTreeInOrder(rootNode.rightNode);

    }
}
