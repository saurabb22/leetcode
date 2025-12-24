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
    public TreeNode dfs(TreeNode root){
        if(root==null) return null;
        TreeNode temp = new TreeNode(root.val);
        temp.left = dfs(root.right);
        temp.right = dfs(root.left);
        return temp;
    }

    public TreeNode invertTree(TreeNode root) {
        return dfs(root);
    }
}