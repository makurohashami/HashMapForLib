package com.company;

import java.util.Arrays;
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
        return false;
    }

    public boolean containsKey(K key) {
        return false;
    }

    public V get(K key) {
        return null;
    }

    public boolean isEmpty() {
        return false;
    }

    public void clear() {

    }

    public int size() {
        return 0;
    }

    public V[] toArray() {
        return null;
    }

    public String toString() {
        return Arrays.toString(toArray());
    }

    //TECHNICAL METHODS

    //private boolean isCorrectID(Identifier id) {
    //    return id.getID() >= 100000 && id.getID() <= 999999;
    //}

    private boolean isNull(Object o) {
        return o == null;
    }
}
