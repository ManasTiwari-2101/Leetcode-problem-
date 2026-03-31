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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null||(root.left==null&&root.right==null)){
            return 0;
        }
        return helper(root,false);
    }
    private int helper(TreeNode root,boolean isleft){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null&&isleft){
            return root.val;
        }
        int l=helper(root.left,true);
        int r=helper(root.right,false);
        return l+r;
    }
}
