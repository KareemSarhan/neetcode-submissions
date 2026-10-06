class Solution {
    public boolean isSubsequence(String s, String t) {
     int len1 = s.length();
     int len2 = t.length();
     if (len1 > len2) return false;
     int i = 0;
     for (int j = 0; i < len1 && j < len2; j++) {
         if (s.charAt(i) == t.charAt(j)) {
             i++;
         }
        }
     return i == len1;
    }
}