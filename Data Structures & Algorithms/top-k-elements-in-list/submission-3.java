class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> Map1 = new HashMap<>();
        for( int num : nums){
            Map1.put(num, Map1.getOrDefault(num,0)+1);
        }
        return Map1.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();    }
}
