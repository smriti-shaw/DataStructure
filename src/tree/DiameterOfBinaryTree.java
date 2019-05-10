package tree;

public class DiameterOfBinaryTree {

    TreeNode<Integer> root = new TreeNode<>();
    MyTree myTree;

    public DiameterOfBinaryTree(){
        myTree = new MyTree();
        root = myTree.getTree();
    }

    public static void main(String[] args) {
        DiameterOfBinaryTree diameter = new DiameterOfBinaryTree();
        System.out.println(diameter.diameter());
    }



    public int diameter(){
        return diameter(root);
    }

    public int diameter(TreeNode<Integer> treeNode){
        if(treeNode == null)
            return 0;

        int lHeight = height(treeNode.left);
        int rheight = height(treeNode.right);

        int lDiameter = diameter(treeNode.left);
        int rDiameter = diameter(treeNode.right);

        return Math.max((1+lDiameter+rDiameter) , Math.max(lHeight, rheight));
    }

    public int height(TreeNode<Integer> node){
        if(node ==null)
            return 0;

        return(1 +Math.max(height(node.left), height(node.right)));
    }

}
