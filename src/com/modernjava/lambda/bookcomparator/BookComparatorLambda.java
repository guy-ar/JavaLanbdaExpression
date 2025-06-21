package com.modernjava.lambda.bookcomparator;

import java.util.Arrays;
import java.util.List;

public class BookComparatorLambda {

    // in order to work with sort - need to implement Collections.sort
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", "Robert C. Martin", 50.0f);
        Book book2 = new Book("Effective Java", "Joshua Bloch", 40.0f);
        Book book3 = new Book("The Pragmatic Programmer", "Andy Hunt", 30.56f);
        Book book4 = new Book("The Bible", 42.99f);

        List<Book> booksList = Arrays.asList(book1, book2, book3, book4);

        booksList.sort((o1, o2) -> {
            return o1.getPrice() == o2.getPrice() ? 0 : o1.getPrice() > o2.getPrice() ? 1 : -1 ;
        });
        // alternative - with lambda using collections.sort
//        Collections.sort(booksList, (o1, o2) -> {
//            return o1.getPrice() == o2.getPrice() ? 0 : o1.getPrice() > o2.getPrice() ? 1 : -1;
//        });

        System.out.println(booksList);
    }
}
