package com.luv2code.logicmojo.BinaryTree;

/**
 *
 * Incomplete
 * defination: the nodes on each sub tree od parent should be equal
 *         1
 *      /     \
 *    2        3
 *  /  \     /  \
 * 4    5   6    7
 *
 * this is balanced tree
 *
 * eg:        1
 *  *      /     \
 *  *    2        3
 *  *  /  \     /
 *  * 4    5   6
 *  and this is not
 *
 */
public class BalancedBinaryTree {
    public static void main(String ar[])
    {
        BinaryTree root = new BinaryTree(1);
        root.leftNode=new BinaryTree(2);
        root.rightNode=new BinaryTree(3);
        root.leftNode.leftNode=new BinaryTree(4);
        root.leftNode.rightNode=new BinaryTree(5);
        root.rightNode.leftNode=new BinaryTree(6);
        root.rightNode.rightNode=new BinaryTree(7);

        System.out.println(isBalanced(root));


    }

    private static boolean isBalanced(BinaryTree node) {
        if(node==null)
            return true;

        isBalanced(node.leftNode);
        isBalanced(node.rightNode);
        return false;
    }
}
