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
    private void getlist(TreeNode root,List<List<Integer>> list,Queue<TreeNode> q){
        if(root==null) return;
        int j=0;
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer> li=new ArrayList<>();
            int l=q.size();
            for(int i=0;i<l;i++){
                TreeNode t=q.poll();
                li.add(t.val);
                if(t.left!=null) q.add(t.left);
                if(t.right!=null) q.add(t.right);
            }
          if(j%2!=0)Collections.reverse(li);
          list.add(li);
          j++;
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> q1=new LinkedList<>();
        getlist(root,list,q1);
        return list;
    }
}