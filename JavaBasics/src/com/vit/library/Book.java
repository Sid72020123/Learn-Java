package com.vit.library;

public class Book {
	public String title;
	private int bookId;
	protected String author;

	public Book() {
		this.title = "<Unknown>";
		this.bookId = -1;
		this.author = "<Unknown>";
	}

	public Book(String title, int bookId, String author) {
		this.title = title;
		this.bookId = bookId;
		this.author = author;
	}

	public void displayInfo() {
		System.out.println("Title: " + title);
		System.out.println("Book ID: " + bookId);
		System.out.println("Author: " + author);
	}
}
