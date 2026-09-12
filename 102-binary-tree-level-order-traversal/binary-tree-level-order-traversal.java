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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        levelorder(root,list,0);
        return  list;
    }
    private void levelorder(TreeNode root,List<List<Integer>> list,int l){
        if(root==null) return;
        if(list.size()==l) list.add(new ArrayList<>());
        list.get(l).add(root.val);
        levelorder(root.left,list,l+1);
        levelorder(root.right,list,l+1);
    }
}