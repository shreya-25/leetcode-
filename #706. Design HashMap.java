class MyHashMap {
 ArrayList<Integer>key1=new ArrayList<Integer>();  
      ArrayList<Integer>value1=new ArrayList<Integer>();  
    /** Initialize your data structure here. */
    public MyHashMap() {
       
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        if(key1.contains(key))
        {
        for(int i=0;i<key1.size();i++)
        {
            if(key1.get(i)==key)
                value1.set(i,value);
        }}
            else{
        key1.add(key);
        value1.add(value);}
        
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if(key1.contains(key))
        {
        for(int i=0;i<key1.size();i++)
        {
            if(key1.get(i)==key)
                return value1.get(i);
        }}
        return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
         if(key1.contains(key))
        {
        for(int i=0;i<key1.size();i++)
        {
            if(key1.get(i)==key)
            {
                key1.remove(i);
                value1.remove(i);
            }
        }}
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
