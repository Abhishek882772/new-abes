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
    private int hei(TreeNode root){
        if(root==null || root.left==null && root.right==null) return 0;
        return 1+ Math.max(hei(root.right),hei(root.left));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null || root.left==null && root.right==null) return true;
        int l=hei(root.left);
        if(root.left != null) l++;
        int r=hei(root.right);
        if(root.right!= null) r++;
        if(Math.abs(l-r) >1) return false;
        return isBalanced(root.left)&& isBalanced(root.right);
    }
}