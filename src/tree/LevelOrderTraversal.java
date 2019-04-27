package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public static void main(String[] args) {
        MyTree tree = new MyTree();
        TreeNode root = tree.getTree();
        LevelOrderTraversal l = new LevelOrderTraversal();
        l.levelOrderTraversal(root);

    }

    public void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node.value);
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }

    }

}
