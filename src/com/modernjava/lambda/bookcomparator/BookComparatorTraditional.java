package com.modernjava.lambda.bookcomparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BookComparatorTraditional {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", "Robert C. Martin", 50.0f);
        Book book2 = new Book("Effective Java", "Joshua Bloch", 40.0f);
        Book book3 = new Book("The Pragmatic Programmer", "Andy Hunt", 30.56f);
        Book book4 = new Book("The Bible", 42.99f);

        List<Book> booksList = Arrays.asList(book1, book2, book3, book4);
        Comparator<Book> boolComparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else {
                    return o1.getPrice() > o2.getPrice() ? 1 : -1;
                }
            }
        };
        booksList.sort(boolComparator);
        System.out.println(booksList);

    }

}
