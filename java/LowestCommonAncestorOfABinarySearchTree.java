import java.util.Stack;

public class LowestCommonAncestorOfABinarySearchTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> trace = new Stack<>();
        dfs(root, p.val, trace);
        while (!trace.isEmpty()) {
            TreeNode curr = trace.pop();
            if (dfs(curr, q.val) != null)
                return curr;
        }
        return null;
    }

    public void dfs(TreeNode node, int target, Stack<TreeNode> trace) {
        trace.push(node);
        if (node.val < target)
            dfs(node.right, target, trace);
        else if (node.val > target)
            dfs(node.left, target, trace);
    }

    public TreeNode dfs(TreeNode node, int target) {
        if (node == null)
            return null;
        else if (node.val < target)
            return dfs(node.right, target);
        else if (node.val > target)
            return dfs(node.left, target);
        else
            return node;
    }

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
