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
    public TreeNode getNode(TreeNode root, int start){
        if(root==null){
            return null;
        }
        if(root.val==start) return root;
        TreeNode left=getNode(root.left,start);
        TreeNode right=getNode(root.right,start);
        if(left==null) return right;
        else return left;
    }
    private void getParent(TreeNode root,Map<TreeNode,TreeNode>map){
        if(root==null) return;
        if(root.left!=null) map.put(root.left,root);
        if(root.right!=null) map.put(root.right,root);
        getParent(root.left,map);
        getParent(root.right,map);
    }
    public int amountOfTime(TreeNode root, int start) {
        TreeNode node=getNode(root,start);
        Map<TreeNode,TreeNode> map=new HashMap<>();
        getParent(root,map);  

        Queue<TreeNode> q=new LinkedList<>();
        q.add(node);
        Map<TreeNode,Integer> i=new HashMap<>();
        i.put(node,0);
        while(q.size()>0){
            TreeNode temp=q.remove();
            if(temp.left!=null && !i.containsKey(temp.left)) {q.add(temp.left); i.put(temp.left,i.get(temp)+1);}
            if(temp.right!=null && !i.containsKey(temp.right)) {q.add(temp.right); i.put(temp.right,i.get(temp)+1);}
            if(map.containsKey(temp) && !i.containsKey(map.get(temp))){q.add(map.get(temp)); i.put(map.get(temp),i.get(temp)+1);}
        }
        int max=-1;
        for(int j:i.values()) max=Math.max(max,j);
        return max;

        }
}