
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> subStringList = new ArrayList<String>();
        for (String word1 : words) {
            for (String word2 : words) {
                if(word1 != word2 && word2.contains(word1))
                    {subStringList.add(word1);
                    break;}
            }
        }
        return subStringList;
    }
}