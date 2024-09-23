package com.library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryFacade libraryFacade = new LibraryFacade();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Borrow a book\n2. Return a book\n3. Search for a book\n4. View Library Summary\n5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter your username: ");
                    String borrowUser = scanner.nextLine();
                    System.out.print("Enter the title of the book to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    System.out.println(libraryFacade.borrowBook(borrowTitle, borrowUser));
                    break;
                case 2:
                    System.out.print("Enter your username: ");
                    String returnUser = scanner.nextLine();
                    System.out.print("Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    System.out.println(libraryFacade.returnBook(returnTitle, returnUser));
                    break;
                case 3:
                    System.out.print("Enter the title of the book to search: ");
                    String searchTitle = scanner.nextLine();
                    System.out.println(libraryFacade.searchBook(searchTitle));
                    break;
                case 4:
                    System.out.println(libraryFacade.getLibrarySummary());
                    break;
                case 5:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
