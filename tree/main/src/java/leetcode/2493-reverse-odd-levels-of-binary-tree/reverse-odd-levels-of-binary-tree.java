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
    public TreeNode reverseOddLevels(TreeNode root) {
        int lvl =0;
        Queue<TreeNode> bfs =new LinkedList<>();
        bfs.add(root);
        TreeNode[] curr_level;
        while(!bfs.isEmpty()){
            int size = bfs.size();
            curr_level=new TreeNode[size];
            for(int i=0;i<size;i++){
                TreeNode current = bfs.poll();
                curr_level[i] = current;
                if(current.left!=null) bfs.add(current.left);
                if(current.right!=null) bfs.add(current.right);

            }
            //odd level check
            if(lvl%2==1){
                for(int i=0;i<size/2;i++){
                    //SWAP
                    int temp = curr_level[i].val;
                    curr_level[i].val = curr_level[size-i-1].val;
                    curr_level[size-i-1].val = temp;
                }
            }
            lvl++;
            


        }
        return root;
    }
}