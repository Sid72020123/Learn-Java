package com.vit.exams;

import java.util.Objects;

public class Topic21ObjectClass {
	public static void main(String[] args) {
		Book first = new Book("Java Basics", "123");
		Book second = new Book("Java Basics", "123");
		System.out.println(first); // toString()
		System.out.println(first.equals(second)); // equals()
		System.out.println(first.hashCode() == second.hashCode()); // hashCode()
		System.out.println(first.getClass().getSimpleName()); // getClass()
	}
}

class Book {
	private final String title, isbn;

	Book(String title, String isbn) {
		this.title = title;
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return title + " (" + isbn + ")";
	}

	@Override
	public boolean equals(Object other) {
		return other instanceof Book && isbn.equals(((Book) other).isbn);
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}
}
