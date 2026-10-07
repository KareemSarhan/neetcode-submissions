class Solution {
    public int appendCharacters(String s, String t) {
        int j=0;
        int lenS = s.length();
        int lenT = t.length();
        for (int i = 0; i < lenS && j < lenT; i++) {
            if ( s.charAt(i)==t.charAt(j))
                j++;
        }
        return lenT - j;
    }
}