class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        int l = 0;
        for (int i = 0; i < t.length() && l < s.length(); i++) {
            if (s.charAt(l) == t.charAt(i))
                l++;
        }
        return l == s.length();
    }
}