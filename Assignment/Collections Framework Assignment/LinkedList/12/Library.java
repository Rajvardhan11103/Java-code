/* 12. Library Management System:
Write a Java program to create a LinkedList of Book objects. Each Book object should 
have properties such as isbn, title, and author. Add five books to the list and provide 
functionality to search for a book by its isbn.
 */ 

import java.util.LinkedList;

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
}

class Library {
    private LinkedList<Book> books;

    public Library() {
        books = new LinkedList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null; // Book not found
    }
}

class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

      
        library.addBook(new Book("123456", "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("789012", "To Kill a Mockingbird", "Harper Lee"));
    

        // Search for a book by ISBN
        String searchIsbn = "123456";
        Book foundBook = library.findBookByIsbn(searchIsbn);
        if (foundBook != null) {
            System.out.println("Book found:");
            System.out.println("Title: " + foundBook.getTitle());
            System.out.println("Author: " + foundBook.getAuthor());
        } else {
            System.out.println("Book with ISBN " + searchIsbn + " not found.");
        }
    }
}
