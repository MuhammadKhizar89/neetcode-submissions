class LRUCache {
    HashMap<Integer, Integer> map;
    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<>(capacity, 0.75f, true);
    }

    public int get(int key) {
        if (!map.containsKey(key))
            return -1;
        return map.get(key);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            map.put(key, value);
            return;
        }

        if (map.size() == capacity) {
            int firstKey = map.keySet().iterator().next();
            map.remove(firstKey);
        }

        map.put(key, value);
    }
}
