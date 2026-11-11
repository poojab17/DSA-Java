class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int count0 = 0;
        int count1 = 0;

        int left = 0;

        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                count0++;
            }

            else{
                count1++;
            }

            if(count0 > k){
                if(nums[left] == 0){
                    count0--;
                }
                left++;
            }
           max = Math.max(max , right - left + 1);
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna