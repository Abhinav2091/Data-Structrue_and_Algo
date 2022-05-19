package com.luv2code.logicmojo.BinaryTree;
/** need a fix
public class BinarySearchTree {
    public int data;
    public BinarySearchTree leftNode;
    public BinarySearchTree rightNode;

    BinarySearchTree() {
    }

    BinarySearchTree(int data) {
        this.data = data;
        this.leftNode = this.rightNode = null;
    }

    public static BinarySearchTree insert(BinarySearchTree node, int data) {
        if (node == null)
            return new BinarySearchTree(data);
        if (data < node.data)
            node.leftNode = insert(node.leftNode, data);
        else
            node.rightNode = insert(node.rightNode, data);
        return node;

    }

    static void displayBinaryTreeInOrder(BinarySearchTree rootNode) {
        if (rootNode == null)
            return;

        displayBinaryTreeInOrder(rootNode.leftNode);
        System.out.print(rootNode.data + ",");
        displayBinaryTreeInOrder(rootNode.rightNode);

    }

    public static void main(String[] ar)
    {
        BinarySearchTree node=null;
        int[] keys = { 13, 14, 22, 25, 23, 32, 26,28,40};
        for (int key : keys) {
            node = insert(node, key);
        }
        displayBinaryTreeInOrder(node);
    }
}**/
