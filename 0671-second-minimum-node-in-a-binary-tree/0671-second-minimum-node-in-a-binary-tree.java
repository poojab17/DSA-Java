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
    public int findSecondMinimumValue(TreeNode root) {
          if(root == null){
            return -1;
        } 

        if(root.left == null && root.right == null){
            return -1;
        }
        int left = root.left.val;
        int right = root.right.val;

        if(left == root.val){
            left = findSecondMinimumValue(root.left);
        }

        if(right == root.val){
            right = findSecondMinimumValue(root.right);
        }

       

         if(left == -1){
            return right;
        }

        if(right == -1){
            return left;
        }
         return Math.min(left, right);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna