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
    class Pair{
        TreeNode node;
        int ind;
        Pair(TreeNode node, int ind){
            this.node = node;
            this.ind = ind;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        Queue<Pair> q = new LinkedList<>();
        int ans = 0;
        q.add(new Pair(root, 0));
        int first = 0;
        int last= 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                Pair curr =  q.poll();
                if(i==0) first = curr.ind;
                if(i==size-1) last = curr.ind;
                if(curr.node.left != null) q.add(new Pair(curr.node.left, 2*curr.ind+1));
                if(curr.node.right != null) q.add(new Pair(curr.node.right,2*curr.ind+2));
            }
            ans = Math.max( (last-first)+1,ans);
        }
        return ans;
    }
}