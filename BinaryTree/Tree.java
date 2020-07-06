package BinaryTree;

// now we need class for tree itself.
// we only need one field in the tree
//and that's the root node because if we have the root we
// can get to everything else.



public class Tree {
//    we just need one thing is root
    //if we have the root node we can get to everything else
    // by traversing it's left child and it's right child.
    private TreeNode root;

//We need a class for the tree and a class for the nodes that will go into the tree.
//Alright so to build a binary tree we're going to need to insert nodes and
//the way we're gonna do it, and we went through this on the slides is,
//if we come to insert a node, if the tree is empty then the node
//becomes the root and we're done.if the tree isn't empty we're gonna
//compare the value we're inserting against the root node.

// If it's less than the root node we're going to go to the left and if it's greater
//than the root node we're going to go to the right and then we're gonna rinse and repeat.

    public void insert(int value) {
    if (root == null) {
        root = new TreeNode(value);
    }
    else {
        root.insert(value);
    }
}

public void traverseInorder(){
        if (root != null){
            root.traverseInOrder();
        }
}


}
