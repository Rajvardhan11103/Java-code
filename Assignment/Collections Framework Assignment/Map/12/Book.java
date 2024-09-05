/* 12. Library System:
Write a Java program to create a LinkedHashMap of String keys and Book values where 
the keys are book titles and the values are Book objects. Each Book object should have 
properties such as author and year. Add five books to the map. Implement functionality 
to search for a book by its title and display its details. */ 


import java.util.*;

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Getters for book properties
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' + ", author='" + author + '\'' + ", year=" + year + '}';
    }
}

class LibrarySystem {
    public static void main(String[] args) {
        // Create a LinkedHashMap to store book titles and Book objects
        LinkedHashMap<String, Book> library = new LinkedHashMap<>();

        // Add five books
        library.put("The Great Gatsby", new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        library.put("To Kill a Mockingbird", new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        library.put("Pride and Prejudice", new Book("Pride and Prejudice", "Jane Austen", 1813));
        library.put("1984", new Book("1984", "George Orwell", 1949));
        library.put("Harry Potter and the Sorcerer's Stone", new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997));

        // Search for a book by title
        String searchTitle = "1984";
        if (library.containsKey(searchTitle)) {
            Book foundBook = library.get(searchTitle);
            System.out.println("Book found:");
            System.out.println(foundBook);
        } else {
            System.out.println("Book not found.");
        }
    }
}
