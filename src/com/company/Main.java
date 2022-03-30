package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Book book0 = new Book("Справочник по Java", "Г. Шилдт", 2005);
        Book book1 = new Book("Справочник по C++", "Г. Шилдт", 2006);
        Book book2 = new Book("1984", "Д. Оруэлл", 1949);
        Book book3 = new Book("МЫ", "Е. Замятин", 1924);

        LibMap<String, Book> map = new LibHashMap<>();

        System.out.println("put null book0: " + map.put(null, book0));
        System.out.println("put 99 null: " + map.put("99", null));
        System.out.println("put 0 book0: " + map.put("0", book0));
        System.out.println("put 1 book1: " + map.put("1", book1));
        System.out.println("put 2 book2: " + map.put("2", book2));
        System.out.println("put 3 book3: " + map.put("3", book3));
        System.out.println(map);
        System.out.println("toArray: " + Arrays.toString(map.toArray()));
        System.out.println("size: " + map.size());
        System.out.println("containsKey 3: " + map.containsKey("3"));
        System.out.println("get 3: " + map.get("3"));
        System.out.println("remove 3: " + map.remove("3"));
        System.out.println("containsKey 3: " + map.containsKey("3"));
        System.out.println("get 3: " + map.get("3"));
        System.out.println(map);
        System.out.println("isEmpty: " + map.isEmpty());
        map.clear();
        System.out.println("Clear");
        System.out.println("isEmpty: " + map.isEmpty());
    }
}