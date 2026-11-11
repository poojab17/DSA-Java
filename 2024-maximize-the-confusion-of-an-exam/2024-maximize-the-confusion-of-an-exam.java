class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
     
        int maxLen = 0;

        int left = 0;

        int t = 0;
        int f = 0;

        for(int right = 0; right < answerKey.length(); right++){
            char ch = answerKey.charAt(right);

            if(ch == 'T'){
                t++;
            }

            else{
                f++;
            }

            while(Math.min(t,f) > k){
                if(answerKey.charAt(left) == 'T'){
                    t--;
                }
                else{
                    f--;
                }

                left++;
            }
maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna