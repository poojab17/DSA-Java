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
    int currMax = Integer.MIN_VALUE;
    public int goodNodes(TreeNode root) {
        return helper(root, currMax);
    }

    private int helper(TreeNode root, int currMax){
        if(root == null) return 0;
        int currAns = 0;
        if(root.val >= currMax){
            currMax = root.val;
            currAns = 1;
        }

        int r = helper(root.right , currMax);
         int l = helper(root.left , currMax);

         return l + r + currAns;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna