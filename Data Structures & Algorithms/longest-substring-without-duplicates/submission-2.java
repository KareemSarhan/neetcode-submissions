class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] pos = new int[127];
        int max = 0;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            if (pos[s.charAt(r)] >= l+1) {
                l = pos[s.charAt(r)];
            }
            pos[s.charAt(r)] = r+1;
            max = Math.max(r - l + 1, max);
        }
        return max;
    }
}
