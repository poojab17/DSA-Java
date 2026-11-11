class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        for(int right=0; right < s.length(); right++){
            char c = s.charAt(right);

            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);

            len = Math.max(right - left + 1, len);
        }
        return len;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna