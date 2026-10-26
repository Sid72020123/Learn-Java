package com.vit.library;

import com.vit.management.LibraryManager;
import com.vit.library.Book;

public class Main {
	public static void main(String[] args) {
		Book b1 = new Book("Book 1", 101, "Author 1");
		Book b2 = new Book("Book 2", 102, "Author 2");
		Book b3 = new Book("Book 3", 103, "Author 3");
		Book b4 = new Book("Book 4", 104, "Author 4");
		LibraryManager lm = new LibraryManager();

		System.out.println("1st Book Title: " + b1.title);
		// System.out.println(b1.bookId);
		// Error: private member

		lm.showBookDetails(b1);
		lm.showBookDetails(b2);

		b3.displayInfo();
		b4.displayInfo();
	}
}
