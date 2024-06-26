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
    List<Integer> values= new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
        if(root==null) return root;
        inorder(root);
        return createBST(0,values.size()-1);
        
    }
    private void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        values.add(root.val);
        inorder(root.right);
        return;
    }
    private TreeNode createBST(int left, int right){
        if(left>right)return null;
        int mid = left+(right - left)/2;
        int data = values.get(mid);

        TreeNode l = createBST(left,mid-1);
        TreeNode r = createBST(mid+1,right);
        return new TreeNode(data,l,r);
        
    }
}