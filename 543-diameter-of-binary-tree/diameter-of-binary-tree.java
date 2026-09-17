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
    private int height(TreeNode root,int h){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        int left=height(root.left,h);
        int right=height(root.right,h);
        h=Math.max(left,right)+1;
        return h;

    }
    public int diameterOfBinaryTree(TreeNode root) {
        int h=0;
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        int l=diameterOfBinaryTree(root.left);
        int r=diameterOfBinaryTree(root.right);
        if(root.left != null) h=h+1+height(root.left,0);
        if(root.right != null) h=h+1+height(root.right,0);
        h=Math.max(h,Math.max(l,r));
        return h;
    }
}