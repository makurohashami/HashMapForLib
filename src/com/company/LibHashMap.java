package com.company;

import java.util.HashMap;
import java.util.Map;

public class LibHashMap<K, V> implements LibMap<K, V> {

    private Map<K, V> map = new HashMap<>();

    public LibHashMap() { }
    public LibHashMap(int capacity) {
        map = new HashMap<>(capacity);
    }

    public boolean put(K key, V value) {
        if(isNull(key) || isNull(value)) { return false; }
        map.put(key,value);
        return true;
    }

    public boolean remove(K key) {
        if(isNull(key)) { return false; }
        map.remove(key);
        return true;
    }

    public boolean containsKey(K key) {
        if(isNull(key)) { return false; }
        return map.containsKey(key);
    }

    public V get(K key) {
        if(isNull(key)) { return null; }
        return map.get(key);
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public void clear() {
        map.clear();
    }

    public int size() {
        return map.size();
    }

    public V[] toArray() {
        return (V[]) map.values().toArray();
    }

    public String toString() {
        return map.toString();
    }

    //TECHNICAL METHOD

    private boolean isNull(Object o) {
        return o == null;
    }
}