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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null) return list;
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            List<Integer> li=new ArrayList<>();
            int j=qu.size();
            for(int i=0;i<j;i++){
                TreeNode t=qu.remove();
                li.add(t.val);
                if(t.left!=null) qu.add(t.left);
                if(t.right!=null) qu.add(t.right);
            }
            list.add(li);
        }
        Collections.reverse(list);
        return list;
    }
}