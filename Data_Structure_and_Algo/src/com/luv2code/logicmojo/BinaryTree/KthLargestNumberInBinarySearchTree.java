package com.luv2code.logicmojo.BinaryTree;

/*
find the kth largest number in the BST
                    22
                  /    \
                14      25
               /       /   \
              13      23    32
                           /  \
                          28  40
                         /
                       26
 */
public class KthLargestNumberInBinarySearchTree {
    public static void main(String[] ar) {
        BinaryTree rootNode = new BinaryTree();
        rootNode.data = 22;
        rootNode.leftNode = new BinaryTree(14);
        rootNode.leftNode.leftNode = new BinaryTree(13);

        rootNode.rightNode = new BinaryTree(25);
        rootNode.rightNode.leftNode = new BinaryTree(23);
        rootNode.rightNode.rightNode = new BinaryTree(32);
        rootNode.rightNode.rightNode.leftNode = new BinaryTree(28);
        rootNode.rightNode.rightNode.leftNode.leftNode = new BinaryTree(26);
        rootNode.rightNode.rightNode.rightNode = new BinaryTree(40);

        kthLargestNumber(rootNode, 3);


    }

    static int count = 0;

    //inorder print the value in acending order so will reverse it for getting the heeightes value first
    static void kthLargestNumber(BinaryTree rootNode, int k) {
        if (rootNode == null)
            return;
        kthLargestNumber(rootNode.rightNode, k);
        count++;
        if (count == k)
            System.out.println(rootNode.data);
        kthLargestNumber(rootNode.leftNode, k);

    }
}
