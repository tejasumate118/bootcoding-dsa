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
    int sum=0;
    public TreeNode bstToGst(TreeNode root) {
        sum=0;
        calc(root);
        return root;
    }
    private void calc(TreeNode node){
        if(node==null)return;
        calc(node.right);
        sum+=node.val;
        node.val=sum;
        calc(node.left);

    }
}