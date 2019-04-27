package tree;

import java.util.TreeMap;

public class TreeNode {

    TreeNode left;
    TreeNode right;
    int value;

    public TreeNode(int value) {
        this.value = value;
        left = null;
        right = null;
    }

    public TreeNode() {
        this.value = 0;
        left = null;
        right = null;
    }

}
