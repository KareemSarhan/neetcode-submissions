class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        int end = len - 1;
        while (end >= 0) {
            if (s.charAt(end) == ' ')
                end -= 1;
            else
                break;
        }
        return end - s.substring(0, end).lastIndexOf(' ');
    }
}