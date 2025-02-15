package org.example;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class Library {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public String toString() {
        return "Library{" + "books=" + books + '}';
    }
}
