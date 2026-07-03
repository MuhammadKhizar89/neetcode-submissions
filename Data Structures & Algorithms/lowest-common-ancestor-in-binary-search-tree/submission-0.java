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
    public TreeNode lowestCommonAncestorChecker(TreeNode root, TreeNode p, TreeNode q){
        if(root==null)
            return null;
        if(Math.max(p.val,q.val)<root.val)
            return lowestCommonAncestorChecker(root.left,p,q);    
        else if (Math.min(p.val,q.val)>root.val)
            return lowestCommonAncestorChecker(root.right,p,q);
        return root;
        
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
             return lowestCommonAncestorChecker(root,p,q);
    }
}
