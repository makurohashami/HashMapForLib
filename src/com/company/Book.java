package com.company;

import java.util.Objects;

public class Book {
    private final String name;
    private final String author;
    private final int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    public int hashCode() {
        return Objects.hash(name, author, year);
    }

    public String toString() {
        return "[Назв.: " + name + ", Авт.: " + author + ", Год: " + year + "]";
    }

    public int getYear() {
        return year;
    }
}