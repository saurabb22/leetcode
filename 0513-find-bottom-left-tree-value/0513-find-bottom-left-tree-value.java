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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int ans = root.val;
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            ans = temp.val;
            if(temp.right != null) q.add(temp.right);
            if(temp.left != null) q.add(temp.left);
        }
        return ans;
    }
}