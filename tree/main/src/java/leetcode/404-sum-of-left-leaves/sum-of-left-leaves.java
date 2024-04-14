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
        if(root==null)return 0;
        int sum=0;
        if(isLeaf(root.left)){
            sum+=root.left.val;
        }else{
            sum+=sumOfLeftLeaves(root.left);
        }
        sum+=sumOfLeftLeaves(root.right);
        return sum;
    }
    boolean isLeaf(TreeNode root){
        return (root!=null&&root.left==null&&root.right==null);
        
    }
}