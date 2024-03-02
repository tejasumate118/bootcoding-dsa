package leetcode;


import java.util.*;

public class Problem_1609 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        // Constructors
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        Integer[] arr = {1, 10, 4, 3, null, 7, 9, 12, 8, 6, null, null, 2};
        Integer[] arr1={5,4,2,3,3,7};
        Integer[] arr3={5,9,1,3,5,7};
        System.out.println(isEvenOddTree(constructTree(arr)));
        System.out.println(isEvenOddTree(constructTree(arr1)));
        System.out.println(isEvenOddTree(constructTree(arr3)));

    }
    static TreeNode constructTree(Integer[] arr) {
        if (arr == null || arr.length == 0 || arr[0] == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(arr[0]);
        queue.offer(root);

        for (int i = 1; i < arr.length; i += 2) {
            TreeNode parent = queue.poll();
            if (parent == null) continue;

            if (arr[i] != null) {
                parent.left = new TreeNode(arr[i]);
                queue.offer(parent.left);
            }

            if (i + 1 < arr.length && arr[i + 1] != null) {
                parent.right = new TreeNode(arr[i + 1]);
                queue.offer(parent.right);
            }
        }
        return root;
    }

    static Queue<TreeNode> oddQ=new LinkedList<>();
    static Queue<TreeNode> evenQ=new LinkedList<>();

    static boolean isEvenOddTree(TreeNode root) {
        if(root.val%2!=0&&root.left==null&&root.right==null) return true;
        oddQ.offer(root);
        while(!oddQ.isEmpty()||!evenQ.isEmpty()) {
            int prevOdd=Integer.MIN_VALUE;
            while (!oddQ.isEmpty()){
                TreeNode odd = oddQ.poll();
                if(odd.val%2==0||prevOdd>=odd.val)return false;
                prevOdd=odd.val;
                if (odd.left != null) evenQ.offer(odd.left);
                if (odd.right != null) evenQ.offer(odd.right);
            }
            int prevEven=Integer.MAX_VALUE;
            while (!evenQ.isEmpty()){
                TreeNode even=evenQ.poll();
                if(even.val%2!=0||prevEven<=even.val)return false;
                prevEven=even.val;
                if(even.left != null) oddQ.offer(even.left);
                if(even.right != null) oddQ.offer(even.right);
            }


        }
        return true;
    }
}
