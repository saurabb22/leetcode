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
    private boolean checkIdentical(TreeNode root, int val){
        if(root==null) return true;
        if(root.val != val) return false;
        return checkIdentical(root.left, val) && checkIdentical(root.right, val);
    }
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        return checkIdentical(root, root.val);
    }
}