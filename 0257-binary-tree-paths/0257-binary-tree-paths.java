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
    public void fun(TreeNode root, List<String> list, StringBuilder sb){
        if(root==null) return;
        int prevLength = sb.length();
        sb.append(root.val);
        if(root.left == null && root.right==null) {
            list.add(sb.toString());
        }else{
            sb.append("->");
            fun(root.left, list, sb);
            fun(root.right, list, sb);
        }
        sb.setLength(prevLength);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        fun(root, list, new StringBuilder());
        return list;
    }
}