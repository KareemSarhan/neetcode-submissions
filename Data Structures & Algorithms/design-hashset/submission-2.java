class MyHashSet {
    List<Integer> vals;
    public MyHashSet() {
        vals = new ArrayList<Integer>();
    }
    
    public void add(int key) {
        if(!vals.contains(key))
        {
            vals.add(key);
        }
    }
    
    public void remove(int key) {
        while(vals.contains(key))
        {
            vals.remove(vals.indexOf(key));
        }
    }
    
    public boolean contains(int key) {
        return vals.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */