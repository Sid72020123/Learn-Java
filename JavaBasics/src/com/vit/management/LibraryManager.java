package com.vit.management;

import com.vit.library.Book;

public class LibraryManager {

	public void showBookDetails(Book book) {
        System.out.println("Title: " + book.title);
        // System.out.println("Author: " + book.author); // Error: cannot access a protected member without subclass

        // System.out.println(book.bookId); // Error: private member cannot be accessed
    }
}
