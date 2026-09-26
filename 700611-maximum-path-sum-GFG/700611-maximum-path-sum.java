/* Structure of binary tree node
class Node{
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}*/

class Solution {
    public int sum = Integer.MIN_VALUE;
    int findMaxSum(Node root) {
        // code here
        dfs(root);
        return sum;
    }
    
    public int dfs(Node root){
        if(root == null) return 0;
        
        int l = Math.max(0,dfs(root.left));
        int r = Math.max(0,dfs(root.right));
        
        sum = Math.max(sum, root.data + l + r);
        return  root.data + Math.max(l,r);

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna