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
    private boolean findsum(TreeNode root,int tar){
        if(root==null) return false; 
        if(root.left==null && root.right==null && root.val==tar ) return true; 
        if(root.left==null && root.right==null && root.val!=tar ) return false; 
        return findsum(root.left,tar-root.val) || findsum(root.right,tar-root.val);
    }
    public boolean hasPathSum(TreeNode root, int t) {
        if(root ==null) return false;
        
        return findsum(root,t);
    }
}