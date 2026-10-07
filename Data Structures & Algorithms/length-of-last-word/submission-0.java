class Solution {
    public int lengthOfLastWord(String s) {
        int lastWordSize = 0;
        int curWordSize = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                lastWordSize = curWordSize > 0 ? curWordSize : lastWordSize;
                curWordSize = 0;
            }
            else
                curWordSize++;
        }
        return curWordSize > 0 ? curWordSize : lastWordSize;
    }
}