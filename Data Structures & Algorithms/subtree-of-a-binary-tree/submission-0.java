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
    public boolean isSubtree(TreeNode q, TreeNode p) {
        if(q == null) return false;
        return isSameTree(q, p) || isSubtree(q.left, p) || isSubtree(q.right, p);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q != null)
            return false;
        if (q == null && p != null)
            return false;
        if (q == null && p == null)
            return true;
        if (p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
