/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    TreeNode invert(TreeNode root) {
        if (root == null)
            return null;
        TreeNode node = new TreeNode(root.val);
        node.right = invert(root.left);
        node.left = invert(root.right);
        return node;
    }
    public TreeNode invertTree(TreeNode root) {
        return invert(root);
    }
}
