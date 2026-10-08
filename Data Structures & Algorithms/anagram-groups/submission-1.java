class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Integer>, List<String>> hm = new HashMap<>();
        for (String s : strs) {
            Integer[] dict = new Integer[26];
            Arrays.fill(dict,0);
            for (int i = 0; i < s.length(); i++) {
                dict[s.charAt(i) - 'a']+=1;
            }
            List<Integer> x = Arrays.asList(dict);
            hm.putIfAbsent(x,new ArrayList<String>());
            hm.get(x).add(s);
        }
        return hm.values().stream().toList();
    }
}
