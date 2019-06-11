package tree;

import java.util.Stack;

public class BinarySearchTree {

     TreeNode<Integer> root;
    BinarySearchTree (){
        this.root = null;
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        Integer[] arr = {10,3,44,11,9,6};
        for(int i=0; i<arr.length; i++){
            binarySearchTree.insert(arr[i]);
        }
        binarySearchTree.display();
    }

    public void display(){
                Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node1 =  stack.pop();
            if(node1.right !=null)
                stack.push(node1.right);
            if(node1.left !=null)
                stack.push(node1.left);
            System.out.println("value"  + node1.value);
        }
    }

    public void insert(Integer data){
        root = insert(data, root);
    }


    public  TreeNode<Integer> insert(Integer data, TreeNode root){
        if(root ==null){
            root = new TreeNode(data);
            return root;
        }
        if(data < (Integer) root.value){
                root.left = insert(data, root.left);
        }
        else if(data > (Integer) root.value){
                root.right = insert(data, root.right);
        }
        return root;
    }

//    void deleteKey(int key)
//    {
//        root = deleteRec(root, key);
//    }
//
//    /* A recursive function to insert a new key in BST */
//    Node deleteRec(Node root, int key)
//    {
//        /* Base Case: If the tree is empty */
//        if (root == null)  return root;
//
//        /* Otherwise, recur down the tree */
//        if (key < root.key)
//            root.left = deleteRec(root.left, key);
//        else if (key > root.key)
//            root.right = deleteRec(root.right, key);
//
//            // if key is same as root's key, then This is the node
//            // to be deleted
//        else
//        {
//            // node with only one child or no child
//            if (root.left == null)
//                return root.right;
//            else if (root.right == null)
//                return root.left;
//
//            // node with two children: Get the inorder successor (smallest
//            // in the right subtree)
//            root.key = minValue(root.right);
//
//            // Delete the inorder successor
//            root.right = deleteRec(root.right, root.key);
//        }
//
//        return root;
//    }

}
