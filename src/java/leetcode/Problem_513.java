package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Problem_513 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        new TreeNode();
        TreeNode n7=new TreeNode(7,null,null);
        TreeNode n6=new TreeNode(6,null,null);
        TreeNode n5=new TreeNode(5,n7,null);
        TreeNode n4=new TreeNode(4,null,null);
        TreeNode n3=new TreeNode(3,n5,n6);
        TreeNode n2=new TreeNode(2,n4,null);
        TreeNode n1=new TreeNode(1,n2,n3);
        System.out.println(findBottomLeftValue(n1));
    }

    private static int findBottomLeftValue(TreeNode root) {
        Deque<TreeNode>q= new ArrayDeque<>();
        q.offer(root);
        TreeNode curr=root;
        while(!q.isEmpty()){
            curr=q.pop();
            if(curr.right!=null)q.offer(curr.right);
            if(curr.left!=null)q.offer(curr.left);
        }
        return curr.val;
    }
}
