public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        return height(root);
    }

    public int height(TreeNode node) {
        if (node == null)
            return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        return 1 + Math.max(lh, rh);
    }

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
