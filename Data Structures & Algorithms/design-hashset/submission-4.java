class MyHashSet {
    List<Integer> data;
    public MyHashSet() {
        data = new ArrayList<Integer>();
    }
    
    public void add(int key) {
        data.add(key);
    }
    
    public void remove(int key) {
        for(int i =0;i<data.size();i++)
        {
            if(data.get(i)==key)
                data.remove(i--);
                
        }
    }
    
    public boolean contains(int key) {
                for(int i =0;i<data.size();i++)
        {
            if(data.get(i)==key)
                return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */