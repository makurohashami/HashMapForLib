package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Book book0 = new Book("Справочник по Java", "Г. Шилдт", 2005);
        Book book1 = new Book("Справочник по C++", "Г. Шилдт", 2006);
        Book book2 = new Book("1984", "Д. Оруэлл", 1949);
        Book book3 = new Book("МЫ", "Е. Замятин", 1924);

        LibMap<Book, Integer> map = new LibHashMap<>();

        System.out.println("put key null: " + map.put(null, 1));
        System.out.println("put value null: " + map.put(book0, null));
        System.out.println("put key year > 2022: " + map.put(new Book("-", "-", 2025), 0));
        System.out.println("put key year = 2022: " + map.put(new Book("-", "-", 2022), 0));
        System.out.println("put val -1: " + map.put(book0, -1));
        System.out.println("put book0: " + map.put(book0, 4));
        System.out.println("put book1: " + map.put(book1, 0));
        System.out.println("put book2: " + map.put(book2, 10));
        System.out.println("put book3: " + map.put(book3, 8));
        System.out.println(map);
        System.out.println("size: " + map.size());
        System.out.println("containsKey new book - - 2000: " + map.containsKey(new Book("-", "-", 2000)));
        System.out.println("get new book - - 2000: " + map.get(new Book("-", "-", 2000)));
        System.out.println("containsKey book2: " + map.containsKey(book2));
        System.out.println("get book2: " + map.get(book2));
        System.out.println("remove book2: " + map.remove(book2));
        System.out.println(map);
        System.out.println("arr = " + Arrays.toString(map.toArray()));
        Integer[] arr1;
        arr1 = map.toArray();
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("isEmpty: " + map.isEmpty());
        System.out.println("Clear");
        map.clear();
        System.out.println("isEmpty: " + map.isEmpty());
        System.out.println(map);
    }
}