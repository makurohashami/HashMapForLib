package com.company;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Справочник по Java", "Г. Шилдт", 2005);
        Book book2 = new Book("Справочник по C++", "Г. Шилдт", 2006);
        Book book3 = new Book("1984", "Д. Оруэлл", 1949);
        Book book4 = new Book("МЫ", "Е. Замятин", 1924);

        LibMap<String, Book> map = new LibHashMap<>();
    }
}
