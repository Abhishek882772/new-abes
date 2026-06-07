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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> map=new HashMap<>();
        HashSet<Integer> child=new HashSet<>();
        for(int[] d:descriptions){
            int parent=d[0];
            int children=d[1];
            int isleft=d[2];

            map.putIfAbsent(parent,new TreeNode(parent));
            map.putIfAbsent(children,new TreeNode(children));

            TreeNode pNode=map.get(parent);
            TreeNode cNode=map.get(children);

            if(isleft==0) pNode.right=cNode;
            else pNode.left=cNode;

            child.add(children);
        }
        for(int[] d:descriptions){
            if(!child.contains(d[0])) return map.get(d[0]);
        }
        return null;
    }
}