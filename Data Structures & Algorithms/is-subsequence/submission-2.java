class Solution {
    public boolean isSubsequence(String s, String t) {
        int last = t.length();
        for (int i = s.length() - 1; i >= 0; i--) {
            last = t.substring(0, last).lastIndexOf(s.charAt(i));
            if (last == -1) {
                return false;
            }
        }
        return true;
    }
}