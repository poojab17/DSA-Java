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
    int c = 0;
    public int[] calcEqualNodes(TreeNode root){
        if(root == null){
            return new int[] {0,0};
        }

        int[] left = calcEqualNodes(root.left);
        int[] right = calcEqualNodes(root.right);

        int sum = left[0] + right[0] + root.val;
        int num = left[1] + right[1] + 1;

        int avg = sum / num;

        if(avg == root.val){
            c++;
        }

        return new int[] {sum,num};
    }
    public int averageOfSubtree(TreeNode root) {
        calcEqualNodes(root);
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna