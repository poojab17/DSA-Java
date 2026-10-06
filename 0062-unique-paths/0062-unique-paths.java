class Solution {
    public int uniquePaths(int m, int n) {
        int total = m + n - 2;
        int k = m - 1;
        long ans = 1;
        for(int i = 1 ; i<=k; i++){
            ans = ans * (total - k + i) / i;
        }

        return (int) ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna