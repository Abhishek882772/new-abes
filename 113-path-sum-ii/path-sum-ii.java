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
     List<List<Integer>> list=new ArrayList<>();
    private void getlist(TreeNode root, int target,List<Integer> li){
        if(root==null) return;
        if(root.left==null && root.right==null){if(target==root.val){li.add(root.val); list.add(new ArrayList<>(li)); li.remove(li.size()-1);
} return;}
        li.add(root.val);
        getlist(root.left,target-root.val,li);
        getlist(root.right,target-root.val,li);
        li.remove(li.size()-1);

    }
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<Integer> li=new ArrayList<>();
        getlist(root,target,li);
        return list;
    }
}