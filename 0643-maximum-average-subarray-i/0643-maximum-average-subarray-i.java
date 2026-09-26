class Solution {

    public double findMaxAverage(int[] nums, int k) {

        int i = 0;
        int sum = 0;
        double avg = Double.MIN_VALUE;

        for (i = 0; i < k; i++) {
            sum += nums[i];
        }

        avg = (double) sum / k;

        for (i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            avg = Math.max(avg, (double) sum / k);
        }

        return avg;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna