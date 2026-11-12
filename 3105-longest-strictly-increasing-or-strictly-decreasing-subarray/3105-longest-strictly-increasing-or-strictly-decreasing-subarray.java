class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 0;
        int dnc = 0;

        int imax = 0; 
        int dmax = 0;

        for(int i=0; i<nums.length-1; i++){
            if(nums[i] < nums[i+1]){
                inc++;
                 
            }

            else{
                inc = 0;
            }
            imax = Math.max(imax, inc);
        }

        for(int i=0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                dnc++;
            }

            else{
                dnc = 0;
            }

        dmax = Math.max(dmax, dnc);

        }
        return Math.max(dmax, imax) + 1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna