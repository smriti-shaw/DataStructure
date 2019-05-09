package tree;

import java.util.TreeMap;

public class TreeNode<T> {

    TreeNode left;
    TreeNode right;
    T value;

    public TreeNode(T value) {
        this.value = value;
        left = null;
        right = null;
    }

    public TreeNode() {
        this.value = null;
        left = null;
        right = null;
    }

}
