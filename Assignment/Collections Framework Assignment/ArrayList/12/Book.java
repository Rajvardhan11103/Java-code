/* 12. Library Management System:
Write a Java program to create an ArrayList of Book objects. Each Book object should 
have properties such as isbn, title, and author. Add five books to the list and provide 
functionality to search for a book by its isbn */ 

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", Title: " + title + ", Author: " + author;
    }
}

class LibraryManagementSystem {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("978-12345", "Effective Java", "Joshua Bloch"));
        books.add(new Book("978-12346", "Head First Java", "Kathy Sierra, Bert Bates"));
        books.add(new Book("978-12347", "Clean Code", "Robert C. Martin"));
        books.add(new Book("978-12348", "Design Patterns", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides"));
        books.add(new Book("978-12349", "Java Concurrency in Practice", "Brian Goetz"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ISBN to search: ");
        String isbnToSearch = scanner.nextLine();

        Book foundBook = searchBookByIsbn(books, isbnToSearch);
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }

        scanner.close();
    }

    public static Book searchBookByIsbn(ArrayList<Book> books, String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}
