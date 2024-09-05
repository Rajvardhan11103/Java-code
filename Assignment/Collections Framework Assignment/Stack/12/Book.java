/* 12. Library Management System:
Write a Java program to create a Stack of Book objects. Each Book object should have 
properties such as isbn, title, and author. Push five books onto the stack and provide 
functionality to search for a book by its isbn. */ 

import java.util.Stack;

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

    @Override
    public String toString() {
        return "Book{" +"isbn='" + isbn + '\'' +", title='" + title + '\'' +", author='" + author + '\'' +'}';
    }
}

class LibraryManagementSystem {
    public static void main(String[] args) {
         
        Stack<Book> bookStack = new Stack<>();

         
        bookStack.push(new Book("978-0061120084", "To Kill a Mockingbird", "Harper Lee"));
        bookStack.push(new Book("978-0141182605", "1984", "George Orwell"));
        bookStack.push(new Book("978-1451673319", "The Great Gatsby", "F. Scott Fitzgerald"));
        bookStack.push(new Book("978-0451524935", "Pride and Prejudice", "Jane Austen"));
        bookStack.push(new Book("978-0060256654", "Where the Wild Things Are", "Maurice Sendak"));

        
        String searchIsbn = "978-0141182605";
        for (Book book : bookStack) {
            if (book.getIsbn().equals(searchIsbn)) {
                System.out.println("Found book by ISBN " + searchIsbn + ":");
                System.out.println(book);
                break;
            }
        }
    }
}
