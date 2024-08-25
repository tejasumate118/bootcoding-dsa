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
    List<Integer> list;
    public List<Integer> postorderTraversal(TreeNode root) {
        this.list= new ArrayList<>();
        postOrder(root);
        return list;
    }
    private void postOrder(TreeNode node){
        if(node==null) return;
        postOrder(node.left);
        postOrder(node.right);
        list.add(node.val);
    }
}