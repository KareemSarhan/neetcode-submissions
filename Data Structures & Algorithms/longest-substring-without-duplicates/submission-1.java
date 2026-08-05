class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> pos = new HashMap<>();
        int max = 0;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            if (pos.getOrDefault(s.charAt(r), -1) >= l) {
                l = pos.get(s.charAt(r)) + 1;
            }
            pos.put(s.charAt(r), r);
            max = Math.max(r - l + 1, max);
        }
        return max;
    }
}
