package com.library;

import java.util.Scanner;
import com.library.Library;
import com.library.User;

public class Main {

		public static void main(String args[]) {


			System.out.println("Welcome to Library Management System..!\n1.Login\n2.Logout");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			switch (num) {
			case 1:
				LibraryManagement.login();
				break;
			case 2:
				LibraryManagement.logout();
				break;
			default:
				System.out.println("InVaild input..");

			}
		}

}
