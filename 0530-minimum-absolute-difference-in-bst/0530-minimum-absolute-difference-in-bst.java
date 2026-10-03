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
    public int prev = Integer.MAX_VALUE;
    public int ans = Integer.MAX_VALUE;;

    public int getMinimumDifference(TreeNode root) {
       return inorder(root);
    }

    public int inorder(TreeNode root) {
        if (root == null)
            return ans;

        inorder(root.left);
        
        ans = Math.min(ans, Math.abs(prev-root.val));
        
        prev = root.val;

        inorder(root.right);

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna