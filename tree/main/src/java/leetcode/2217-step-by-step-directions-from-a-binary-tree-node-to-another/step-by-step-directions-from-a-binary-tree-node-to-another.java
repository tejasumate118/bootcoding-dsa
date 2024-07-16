/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    private boolean helper(TreeNode root, int des, StringBuilder sb) {
        // edge
        if (root.val == des) {
            return true;
        }

        if (root.left != null && helper(root.left, des, sb)) {
            sb.append("L");
            return true;
        }
        if (root.right != null && helper(root.right, des, sb)) {
            sb.append("R");
            return true;
        }

        return false;
    }

    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder start_str = new StringBuilder();
        StringBuilder dest_str = new StringBuilder();

        helper(root, startValue, start_str);
        helper(root, destValue, dest_str);

        start_str.reverse();
        dest_str.reverse();
        while (start_str.length() > 0 && dest_str.length() > 0
                && start_str.charAt(0) == dest_str.charAt(0)) {
            start_str.deleteCharAt(0);
            dest_str.deleteCharAt(0);
        }
        return "U".repeat(start_str.length()) + dest_str.toString();
    }
}