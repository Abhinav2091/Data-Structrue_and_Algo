package com.luv2code.samplePractice.Tree;

public class Tree {
    private TreeNode root;

    public void insert(int value) {//if root is null then insert root value
        if (root == null)
            root = new TreeNode(value);
            //else call the insert method of Tree Node
        else
            root.insert(value);
    }


    public void traverseInOrder() {
        //if root is not null then traverse it
        if (root != null)
            root.traverseInOrder();
    }

    public void traversePreOrder() {
        //if root is not null then traverse it
        if (root != null)
            root.traversePreOrder();
    }

    public TreeNode get(int value) {
        //if root is not null then traverse it
        if (root != null)
            return root.get(value);

        return null;
    }

    public int min() {
        if (root != null)
            return root.min();

        return -1;
    }

    public int max() {
        if (root != null)
            return root.max();

        return -1;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subTreeRoot, int value) {
        //if tree is null;
        if (subTreeRoot == null)
            return null;
        if (value < subTreeRoot.getData()) {//check for left side if find the value replace it with child that it have
            //which is gonna be null or its one sub child
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(), value));
        } else if (value > subTreeRoot.getData()) {//check for right side if find the value replace it with child that it have
            //which is gonna be null or its one sub child
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
        } else {
            //cases when its is leaf or one child.
            if (subTreeRoot.getLeftChild() == null) {
                //will return null is it is leaf
                //else will  return the right child;
                return subTreeRoot.getRightChild();
            } else if (subTreeRoot.getRightChild() == null) {
                return subTreeRoot.getLeftChild();
            }

            // case if the node have two children
            //we will do from right sub tree way we need to chose one side.
            //so for this we will replace the node we want to delete with smallest value in right side
            //and if that node have left child e will replace that child with its value.
            subTreeRoot.setData(subTreeRoot.getRightChild().min());
            //and delete the node that have smallest value in right sub tree.
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), subTreeRoot.getData()));

        }
        //if we reach here then we don't want to delete it so set it again to same stage
        return subTreeRoot;
    }
}
