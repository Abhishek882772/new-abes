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
    private void equalpath(TreeNode root,String s,List<String> li){
        if(root==null) return;
        if(root.left==null && root.right==null) {
            s+=root.val;
             li.add(s); 
             return;
            }
        equalpath(root.left,s+root.val+"->",li);
        equalpath(root.right,s+
        root.val+"->",li);

    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> li=new ArrayList<>();
        equalpath(root,"",li);
        return li;
    }
}