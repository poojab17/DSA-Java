import java.util.*;
/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int d)
    {
        data = d;
        left = right = null;
    }
}*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Node> q = new LinkedList<>();
        
        q.addFirst(root);
        boolean rev = false;
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i=0; i<size; i++){
                
                if(rev == false){
                    
                Node curr = q.pollFirst();
                    list.add(curr.data);
                    
                    if(curr.left != null){
                        q.addLast(curr.left);
                    }
                    
                    if(curr.right != null){
                        q.addLast(curr.right);
                    }
                }
                
                else{
                    
                Node curr = q.pollLast();
                    list.add(curr.data);
                    
                    if(curr.right != null){
                        q.addFirst(curr.right);
                    }
                    
                    if(curr.left != null){
                        q.addFirst(curr.left);
                    }
                }
                
            }
            
            rev = !rev;
            
        }
        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna