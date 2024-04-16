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
    int dep;
    int val;
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        this.dep=depth;
        this.val=val;
        dfs(root,1);
        if(depth==1){
            TreeNode newnode=new TreeNode(val);
            newnode.left=root;
            return newnode;
        }
        return root;
    }
    void dfs(TreeNode root, int depth){
        if(root==null) return;
        if(depth>=dep)return;
        
        if(depth==dep-1){
            TreeNode newnode= new TreeNode(val);
            newnode.left=root.left;
            root.left=newnode;
            TreeNode newnode2=new TreeNode(val);
            newnode2.right=root.right;
            root.right=newnode2;

        }
        dfs(root.left,depth+1);
        dfs(root.right,depth+1);
        
    }


}