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
    public void fun(TreeNode root, int ind, List<Integer> list){
        if(root==null) return;
        if(list.size() == ind) list.add(root.val);
        fun(root.right, ind+1, list);
        fun(root.left, ind+1, list);
    }
    public List<Integer> rightSideView(TreeNode root) {
        int ind = 0;
        List<Integer> list = new ArrayList<>();
        fun(root,0, list);
        return list;
    }
}