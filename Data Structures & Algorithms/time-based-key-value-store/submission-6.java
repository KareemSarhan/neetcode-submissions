class TimeMap {
    HashMap<String, List<AbstractMap.SimpleEntry<Integer, String>>> hm;
    public TimeMap() {
        hm = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        List<AbstractMap.SimpleEntry<Integer, String>> koko =
            hm.getOrDefault(key, new ArrayList<>());
        koko.add(new AbstractMap.SimpleEntry<>(timestamp, value));
        hm.put(key, koko);
    }

    public String get(String key, int timestamp) {
        if (!hm.containsKey(key))
            return "";
        List<AbstractMap.SimpleEntry<Integer, String>> s = hm.get(key);
        int max = s.size() - 1;
        int min = 0;
        int mid = 0;
        int ans = -1;
        while (min <= max) {
            mid = min + (max - min + 1) / 2;
            if (s.get(mid).getKey() == timestamp) 
                return hm.get(key).get(mid).getValue();
            if (s.get(mid).getKey() < timestamp) {
                ans = mid;
                min = mid+1;
            }
            else 
                max = mid-1;
            
        }
        return ans >=0 ? hm.get(key).get(ans).getValue() : "";
 
    }
}