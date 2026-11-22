class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int count = 0;
        int length = arr.length;

        for (int i = 1; i <= length; i += 2) {
            for (int j = 0; j <= length - i; j++) {
                for (int k = j; k < j + i; k++) {
                    count += arr[k];
                }
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna