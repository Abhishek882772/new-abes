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
    private int sum(TreeNode root,int s){
        if(root == null) return 0;
        return s= root.val+sum(root.left,s)+sum(root.right,s);
    }
    private int length(TreeNode root,int len){
        if(root==null)return 0;
        return len=1+length(root.left,len)+length(root.right,len);

    }
    public int averageOfSubtree(TreeNode root) {
        int count=0;
        if(root == null) return 0;
        if(sum(root,0) / length(root,0) == root.val) count++;
        count+=averageOfSubtree(root.left);
        count+=averageOfSubtree(root.right);
        return count;
    }
}