class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        int k = p.length();

        if (s.length() < k) return ans;

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : p.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < k; i++) {
            char c = s.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        if (map.equals(map2)) {
            ans.add(0);
        }

        for (int right = k; right < s.length(); right++) {

            
            char remove = s.charAt(right - k);

            map2.put(remove, map2.get(remove) - 1);

            if (map2.get(remove) == 0) {
                map2.remove(remove);
            }

          
            char add = s.charAt(right);

            map2.put(add, map2.getOrDefault(add, 0) + 1);

            if (map.equals(map2)) {
                ans.add(right - k + 1);
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna