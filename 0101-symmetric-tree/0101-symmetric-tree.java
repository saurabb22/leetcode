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
    public boolean isMirror(TreeNode subleft, TreeNode subright){
        if(subleft == null && subright == null) return true;

        if(subleft == null || subright==null || subleft.val!=subright.val) return false;
        boolean left =  isMirror(subleft.left, subright.right);
        boolean right = isMirror(subleft.right, subright.left);
        if(left== true && right==true) return true;
        else return false; 

    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isMirror(root.left, root.right);
    }
}