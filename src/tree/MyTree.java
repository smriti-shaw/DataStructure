package tree;

public class MyTree {

    public TreeNode getTree(){
        TreeNode root = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1  = new TreeNode(3);
        TreeNode left2  = new TreeNode(4);
        TreeNode right2  = new TreeNode(5);
        TreeNode left3  = new TreeNode(6);
        TreeNode right3  = new TreeNode(7);
        root.left = left1;
        root.right = right1;
        root.left.left = left2;
        root.left.right = right2;
        root.right.left = left3;
        root.right.right = right3;
        return root;
    }
}
