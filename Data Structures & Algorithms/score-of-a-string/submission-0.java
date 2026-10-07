class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        int lenS = s.length();
        for (int i = 0; i < lenS-1; i++) {
            score += Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return score;
    }
}