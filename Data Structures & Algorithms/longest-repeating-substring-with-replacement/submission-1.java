class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, r = 0;
        int max = 0;
        int maxF = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        while (r < s.length()) {
            hm.put(s.charAt(r), hm.getOrDefault(s.charAt(r), 0) + 1);
            
            maxF = Math.max(maxF, hm.get(s.charAt(r)));
            if (r - l + 1 - maxF > k) {
                hm.put(s.charAt(l), hm.get(s.charAt(l))- 1);
                l++;
            }
            max = Math.max(max, r++ - l + 1);
        }
        return max;
    }
}
