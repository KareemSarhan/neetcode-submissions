class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int i = 0;
        for(;i<word1.length() && i<word2.length();i++){
            res +=word1.charAt(i);
            res +=word2.charAt(i);
        }
        for(;i<word1.length();i++){
            res +=word1.charAt(i);
        }        
        for(;i<word2.length();i++){
            res +=word2.charAt(i);
        }
        return res;
    }
}