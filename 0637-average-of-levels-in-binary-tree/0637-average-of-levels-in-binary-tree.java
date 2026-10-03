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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Double> ans = new ArrayList<>();

        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            double avg = 0;
            ArrayList<Integer> level = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                level.add(curr.val);

                if(curr.left != null){
                    q.offer(curr.left);
                }

                 if(curr.right != null){
                    q.offer(curr.right);
                }
            }
 int s = level.size();
double sum = 0;
            for(int i : level){
                
                sum += i; 
            }

            avg = sum/s;

            ans.add(avg);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna