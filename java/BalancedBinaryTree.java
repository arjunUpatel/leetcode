class BalancedBinaryTree {
    boolean res = true;

    public boolean isBalanced(TreeNode root) {
        height(root);
        return res;
    }

    private int height(TreeNode node) {
        if (node == null)
            return 0;
        int rightHeight = height(node.right);
        int leftHeight = height(node.left);
        if (Math.abs(rightHeight - leftHeight) > 1)
            res = false;
        return 1 + Math.max(rightHeight, leftHeight);
    }

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}