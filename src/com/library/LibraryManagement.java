package com.library;
import java.util.Arrays;
import java.util.Scanner;
public class LibraryManagement {
	
		static Scanner sc = new Scanner(System.in);

		static Library l = new Library();
		static LibraryManagement lm = new LibraryManagement();

		public static void login() {
			System.out.println("Enter Name");
			String uname = sc.next();

			System.out.println("Password");
			String pass = sc.next();

			User[] users = l.getUsers();
			boolean found = false;
			for (User user : users) {

				if (user.getUserName().equals(uname) && user.getUserPassword().equals(pass)) {

					System.out.println("User login sucessfully..!");

					found = true;
					lm.dashBoard();
					break;
				}
			}
			if (!found) {
				System.out.println("Invaild Credentials");
			}

		}

		
		private void searchByBooks() {
			sc.nextLine();
			System.out.println("Enter book name : ");
			String b = sc.nextLine();

			boolean bookFound = false;
			Book[] books = l.getBooks();
			for (Book book : books) {
				if (book.getBookName().equalsIgnoreCase(b)) {
					System.out.println("Book Found..!");
					bookFound = true;
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------");
					System.out.println(
							"     Book Name            ||   Author            ||   Year   ||   Price    ||    Genre     ||    NumberOfBooksa  ");
					System.out.println(
							"-------------------------------------------------------------------------------------------------------------------");

					System.out.printf("     %-20s || %-16s   ||  %-8s || %-12" + "s || %-10s || %d%n", book.getBookName(),
							book.getBookAuthor(), book.getYear(), book.getPrice(), book.getGenre(),
							book.getNumberOfBooks());
					break;
				}
			}
			if (!bookFound) {
				System.out.println("Book Not Found..!");
			}
			System.out.println();
		}
			
	public static void login1() {
		System.out.println("Enter Name");
		String uname = sc.next();

		System.out.println("Password");
		String pass = sc.next();

		User[] users = l.getUsers();
		boolean found = false;
		for (User user : users) {

			if (user.getUserName().equals(uname) && user.getUserPassword().equals(pass)) {

				System.out.println("User login sucessfully..!");

				found = true;
				lm.dashBoard();
				break;
			}
		}
		if (!found) {
			System.out.println("Invaild Credentials");
		}

	}

	public void dashBoard() {
		int num;
		do {
			System.out.println(">>> 1.ViewBooks\n>>> 2.SearchByBook\n>>> 3.serchByAuthor\n>>> 4.Exit");
			System.out.println("Enter you choice : ");

			num = sc.nextInt();
			switch (num) {
			case 1:
				viewBook();
				break;
			case 2:
				searchByBooks();
				break;
			case 3:
				searchByAuthor();
				break;
			case 4:
				System.out.println("Thank you. Goodbye!");
				break;

			default:
				System.out.println("Invalid choice. Please enter a valid option.");

			}
		} while (num != 4);
		System.out.println();
		}

	

	private void viewBook() 
	{
		Book[] books = l.getBooks();
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"     Book Name            ||   Author            ||   Year   ||   Price      ||    Genre     ||    NumberOfBooksa  ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------");
		for (Book book : books) {

			System.out.printf("     %-20s || %-16s   ||  %-8s || %-12" + "s || %-10s || %d%n", book.getBookName(),
					book.getBookAuthor(), book.getYear(), book.getPrice(), book.getGenre(), book.getNumberOfBooks());

		}
		System.out.println();
		}

	public static void searchByAuthor() {
		sc.nextLine();
		System.out.println("Enter book Author : ");
		String b = sc.nextLine();

		Book[] books = l.getBooks();
		Book[] foundBooks = new Book[books.length];
		int count = 0;

		for (Book book : books) {
			System.out.println(b);
			if (book.getBookAuthor().equalsIgnoreCase(b)) {
				foundBooks[count++] = book;
			}
		}

		if (count > 0) {
			System.out.println("Books Found for Author " + b + ":");
			bookFormat(Arrays.copyOf(foundBooks, count));
		} else {
			System.out.println("No Books Found for Author " + b);
		}
		System.out.println();
	}


	private static void bookFormat(Book[]books) {
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"     Book Name            ||   Author            ||   Year   ||   Price    ||    Genre     ||    NumberOfBooksa  ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------");

		for (Book book : books) {
			System.out.printf("     %-20s || %-16s   ||  %-8s || %-12" + "s || %-10s || %d%n", book.getBookName(),
					book.getBookAuthor(), book.getYear(), book.getPrice(), book.getGenre(), book.getNumberOfBooks());
		}


	}
	public static void logout() {
		System.out.println("Thank you .....!");
		System.exit(0);
	}
		
}
