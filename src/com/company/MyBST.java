package com.company;

public class MyBST {

    public void insert(Object object) {

    }

    public boolean remove(Object object) {
        return false;
    }

    public Object search(Object object) {
        return null;
    }

    public void preOrderTraversal() {
            /*
            Type 1 of a Depth First Traversal - Stacks can be useful
            Preorder traversal is used to create a copy of the tree.
             1. Visit the root.
             2. Traverse the left subtree, i.e., call Preorder(left-subtree)
             3. Traverse the right subtree, i.e., call Preorder(right-subtree)
             */
    }

    public void postOrderTraversal() {
        /*
         Type 2 of a Depth First Traversal -  Stacks can be useful
        Postorder traversal is used to delete the tree.
           1. Traverse the left subtree, i.e., call Postorder(left-subtree)
           2. Traverse the right subtree, i.e., call Postorder(right-subtree)
           3. Visit the root.
         */
    }

    public void inOrderTraversal(){
        /*
         Type 3 of a Depth First Traversal -  Stacks can be useful
        Inorder traversal gives nodes in non-decreasing order.
          1. Traverse the left subtree, i.e., call Inorder(left-subtree)
          2. Visit the root.
          3. Traverse the right subtree, i.e., call Inorder(right-subtree)
         */

    }

    public void breadthFirstSearch() {
        /*
        Prints each level of the tree - (hint, use a Queue)
         */
    }


}
