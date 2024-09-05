/* 12. Library Management System:
Write a Java program to create a Vector of Book objects. Each Book object should have 
properties such as isbn, title, and author. Add five books to the vector and provide functionality 
to search for a book by its isbn. */ 

import java.util.Vector;

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
        return "Book{" +"isbn='" + isbn + '\'' +", title='" + title + '\'' +", author='" + author + '\'' +'}';
    }
}

class LibraryManagementSystem {
    public static void main(String[] args) {
        
        Vector<Book> bookVector = new Vector<>();

        
        bookVector.add(new Book("978-0061120084", "To Kill a Mockingbird", "Harper Lee"));
        bookVector.add(new Book("978-0141182605", "1984", "George Orwell"));
        bookVector.add(new Book("978-1451673319", "The Great Gatsby", "F. Scott Fitzgerald"));
        bookVector.add(new Book("978-0743273565", "The Catcher in the Rye", "J.D. Salinger"));
        bookVector.add(new Book("978-0060256654", "Where the Wild Things Are", "Maurice Sendak"));

         
        String searchIsbn = "978-1451673319";
        for (Book book : bookVector) {
            if (book.getIsbn().equals(searchIsbn)) {
                System.out.println("Found book:");
                System.out.println(book);
                break;
            }
        }
    }
}
