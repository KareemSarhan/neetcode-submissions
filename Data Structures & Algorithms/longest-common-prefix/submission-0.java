class Solution {
    public String longestCommonPrefix(String[] strs) {
        int last = strs[0].length();
        for (int i = 0; i < strs.length-1;i++){
            if (last > strs[i+1].length())
                last = strs[i+1].length();

            if (!strs[i].substring(0, last).equals(strs[i+1].substring(0, last))) {
                last--;
                i=-1;
            }
        }
        return strs[0].substring(0, last);
    }
}