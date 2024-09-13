package com.library;

public class Library {
	Book book1 = new Book("Harry potter", "JK Rowling", 1995, 452.4f, "Adventure", 5);
	Book book2 = new Book("The 5AM Clube", "Robin Sharma", 2005, 1001.4f, "Self Help", 4);
	Book book3 = new Book("The Indian Girl", "Chetan Bhagat", 2019, 5485.4f, "Fiction", 2);
	Book book4 = new Book("Hound of baskarvelli", "Sharlock Holmes", 2002, 458.4f, "Triller", 4);
	

	User user1 = new User("Vinay", "Vinay@123");
	User user2 = new User("Kumar", "Kumar@123");
	User user3 = new User("Sai", "Sai@123");
	User user4 = new User("Ravi", "Ravi@123");
	User user5 = new User("a", "a");

	public Book[] getBooks() {
		Book[] bookArray = { book1, book2, book3, book4 };
		return bookArray;

	}

	public User[] getUsers() {
		User[] UserArray = { user1, user2, user3, user4,user5 };
		return UserArray;

	}

	
}
