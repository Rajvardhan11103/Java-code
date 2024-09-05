/* 3. Sorting Books by Title:
Write a Java program to create a Book class with properties isbn, title, and author. 
Implement the Comparable interface to sort books by their titles in alphabetical order. 
Create a Vector of Book objects, add five books to the vector, and display the sorted 
list. */ 

import java.util.Vector;
import java.util.Collections;

class Book implements Comparable<Book> {
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
    public int compareTo(Book otherBook) {
        // Compare books based on their titles (in alphabetical order)
        return this.title.compareTo(otherBook.title);
    }
	
    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }


}

class BookTitleSorting {
    public static void main(String[] args) {
        Vector<Book> bookVector = new Vector<>();
        bookVector.add(new Book("978-0061120084", "To Kill a Mockingbird", "Harper Lee"));
        bookVector.add(new Book("978-0141182605", "1984", "George Orwell"));
        bookVector.add(new Book("978-1451673319", "The Great Gatsby", "F. Scott Fitzgerald"));
        bookVector.add(new Book("978-0743273565", "The Catcher in the Rye", "J.D. Salinger"));
        bookVector.add(new Book("978-0060256654", "Where the Wild Things Are", "Maurice Sendak"));

        // Sort the books by title (in alphabetical order)
        Collections.sort(bookVector);

        System.out.println("Sorted Book List (by title):");
        for (Book book : bookVector) {
            System.out.println(book);
        }
    }
}
