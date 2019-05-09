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

}
