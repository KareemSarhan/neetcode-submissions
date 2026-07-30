class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        for (int i = 0, j = s.length() - 1; i < s.length() && j >= 0;) {
            if (!((s.charAt(i) <= 'z' && s.charAt(i) >= 'a')
                    || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))) {
                i++;
            } else if (!((s.charAt(j) <= 'z' && s.charAt(j) >= 'a')
                           || (s.charAt(j) >= '0' && s.charAt(j) <= '9'))) {
                j--;
            } else if (s.charAt(i) == (s.charAt(j))) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
