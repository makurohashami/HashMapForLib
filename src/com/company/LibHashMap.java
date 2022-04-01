package com.company;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LibHashMap<K, V> implements LibMap<com.company.Book, java.lang.Integer> {

    private Map<com.company.Book, Integer> map = new HashMap<>();

    public LibHashMap() { }
    public LibHashMap(int capacity) {
        map = new HashMap<>(capacity);
    }

    public boolean put(com.company.Book key, java.lang.Integer value) {
        if(isNull(key) || isNull(value)) { return false; }
        if(value < 0) {
            //System.out.println("Incorrect num: " + value.intValue() + " < 0");
            return false;
        }
        if(key.getYear() > LocalDateTime.now().getYear()) {
            //System.out.println("Incorrect year: " + key.getYear() + " > " + LocalDateTime.now().getYear());
            return false;
        }
        map.put(key,value);
        return true;
    }

    public boolean remove(com.company.Book key) {
        if(isNull(key)) { return false; }
        map.remove(key);
        return true;
    }

    public boolean containsKey(com.company.Book key) {
        if(isNull(key)) { return false; }
        return map.containsKey(key);
    }

    public java.lang.Integer get(com.company.Book key) {
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

    public Integer[] toArray() {
        return map.values().toArray(new Integer[0]);
    }

    public String toString() {
        return map.toString();
    }

    //TECHNICAL METHOD

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibHashMap)) return false;
        LibHashMap<?, ?> that = (LibHashMap<?, ?>) o;
        return Objects.equals(map, that.map);
    }

    public int hashCode() {
        return Objects.hash(map);
    }

    private boolean isNull(Object o) {
        return o == null;
    }
}