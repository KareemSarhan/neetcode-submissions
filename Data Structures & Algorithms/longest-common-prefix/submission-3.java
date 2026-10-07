class Solution {
    public String longestCommonPrefix(String[] strs) {
        int longest = 0;
        for (int j = 0; j < strs[0].length(); j++) {
            Character cur = strs[0].charAt(longest);
            for (int i = 0; i < strs.length; i++) {
                if (longest >= strs[i].length() || strs[i].charAt(longest) != cur)
                    return strs[0].substring(0,longest);
            }
            longest++;
        }
        return strs[0].substring(0,longest);
    }
}