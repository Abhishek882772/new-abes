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
    public void flatten(TreeNode root) {
        if(root==null) return;
        TreeNode leftT=root.left;
        TreeNode rightT=root.right;
        flatten(leftT);
        flatten(rightT);
        root.left=null;
        root.right=leftT;
        TreeNode temp=root;
        while(temp.right!=null){
            temp=temp.right;
        }
         temp.right=rightT;
        return;
    }
}