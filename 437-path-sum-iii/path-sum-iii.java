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
    private int getsum(TreeNode root,long t){
        if (root ==null) return 0;
        int c=0;
        if(t==root.val) c++;
        return  c+getsum(root.left,t-root.val)+getsum(root.right,t-root.val);
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        return getsum(root,(long)targetSum) + pathSum(root.left,targetSum)+ pathSum(root.right, targetSum);
    }
}