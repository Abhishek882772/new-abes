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
    private TreeNode create(int[] preo,int pi,int pf,int[] ino,int in,int inf){
        if(pi>pf) return null;
        TreeNode t=new TreeNode(preo[pi]);
        int j=in;
        while(preo[pi] != ino[j]) j++;
        int i=j-in;
        t.left=create(preo,pi+1,pi+i,ino,in,j-1);
        t.right=create(preo,pi+i+1,pf,ino,j+1,inf);
        return t;
    }
    public TreeNode buildTree(int[] preo, int[] ino) {
        int n=preo.length;
        return create(preo,0,n-1,ino,0,n-1);
    }
}