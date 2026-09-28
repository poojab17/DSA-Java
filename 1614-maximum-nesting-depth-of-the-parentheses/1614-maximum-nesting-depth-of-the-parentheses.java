class Solution {
    public int maxDepth(String s) {
        int c = 0;
        int max_c = 0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == '('){
                c++;
            }

            if(s.charAt(i) == ')'){
                c--;
            }

            max_c = Math.max(max_c,c);
        }
        return max_c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna