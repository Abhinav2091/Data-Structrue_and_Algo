package com.luv2code.samplePractice.Tree;

import java.util.StringJoiner;
import java.util.TreeMap;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        //duplicates not allowed
        if (value == data)
            return;
        //if value is less go to left child
        if (value < data) {
            //if we get empty node insert value
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            }
            //else search for empty space
            else {
                leftChild.insert(value);
            }
        }
        //else go for right side
        else {
            //if we get empty node insert value
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            }
            //else search for empty space
            else {
                rightChild.insert(value);
            }

        }

    }

    public TreeNode get(int value) {
        if (value == data)
            return this;

        if (value < data) {
            if (leftChild != null)
                return leftChild.get(value);
        } else {
            if (rightChild != null) {
                return rightChild.get(value);
            }
        }
        return null;
    }

    public void traverseInOrder() {
        //visit left child first
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }
        System.out.print(data + ",");
        //then visit right child
        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }

    public void traversePreOrder() {

        System.out.print(data + ",");
        if (leftChild != null)
            leftChild.traversePreOrder();
            if (rightChild != null)
                rightChild.traversePreOrder();


    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public int min() {
        // if there is no left child either it is leaf node or we get the min value
        if (leftChild == null)
            return data;
        return leftChild.min();
    }

    public int max() {
        // if there is no left child either it is leaf node or we get the min value
        if (rightChild == null)
            return data;
        return rightChild.max();

    }


    @Override
    public String toString() {
        return new StringJoiner(", ", TreeNode.class.getSimpleName() + "[", "]")
                .add("data=" + data)
                .toString();
    }
}
