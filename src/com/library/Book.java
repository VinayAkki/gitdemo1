package com.library;

public class Book {

	private String bookName;
	private String bookAuthor;
	private int year;
	private float price;
	private String genre;
	private int numberOfBooks;

	public Book(String bookName, String bookAuthor, int year, float price, String genre, int numberOfBooks) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.year = year;
		this.price = price;
		this.genre = genre;
		this.numberOfBooks = numberOfBooks;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getNumberOfBooks() {
		return numberOfBooks;
	}

	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}

//		@Override
//		public String toString() {
//			return "Book [bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", year=" + year + ", price=" + price
//					+ ", genre=" + genre + ", numberOfBooks=" + numberOfBooks + "]";
//		}

}
