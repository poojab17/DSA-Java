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
    public int ans = 0;
    public int c = 0;

    public int kthSmallest(TreeNode root, int k) {
        return helper(root, k);
    }

    public int helper(TreeNode root, int k) {
        if (root == null)
            return ans;

        helper(root.left, k);
        c++;

        if (c == k) {
            ans = root.val;

        }

        if (c < k) {
            helper(root.right, k);
        }
        return ans;
    }
}