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
    String smallest="";
    StringBuilder sb;
    public String smallestFromLeaf(TreeNode root) {
        sb=new StringBuilder();
        dfs(root);
        return smallest;
    }
    void dfs(TreeNode root){
        if(root==null) return;
        sb.append((char) ('a'+root.val));
        
        
        if(root.left==null&&root.right==null){
            sb.reverse();
            if(smallest=="")smallest=sb.toString();
            else
            smallest = sb.toString().compareTo(smallest) < 0 ? sb.toString() : smallest;
             sb.reverse();

       
        }
       
        dfs(root.left);
        dfs(root.right);
        sb.deleteCharAt(sb.length()-1);

    }
}