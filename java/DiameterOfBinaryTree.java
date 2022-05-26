public class DiameterOfBinaryTree {
    int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;
    }

    public int dfs(TreeNode node) {
        if (node == null)
            return 0;
        int rightHeight = dfs(node.right);
        int leftHeight = dfs(node.left);
        res = Math.max(rightHeight + leftHeight, res);
        return 1 + Math.max(rightHeight, leftHeight);
    }

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
