/* Assignment Questions on Implementing Comparators
1. ArrayList
	1. Sorting Books by Multiple Criteria:
			o Write a Java program to create a Book class with properties id, title, and 
				publicationYear. Implement two Comparator classes:
	1. ByPublicationYearComparator: Sort books by their publication year in 
		
	2. ByTitleComparator: Sort books by their titles in alphabetical order.
		o Create an ArrayList of Book objects, add five books with different titles and 
			publication years, and use both comparators to sort the list. Display the sorted 
			lists. */ 



import java.util.*;

class Book {
     int id;
     String title;
     int publicationYear;

    public Book(int id, String title, int publicationYear) {
        this.id = id;
        this.title = title;
        this.publicationYear = publicationYear;
    }
	
     public int getPublicationYear() {
        return publicationYear;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return "Book{" +"id=" + id +", title='" + title + '\'' +", publicationYear=" + publicationYear +'}';
    }
}

class ByPublicationYearComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return Integer.compare(book1.getPublicationYear(), book2.getPublicationYear());
    }
}

class ByTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getTitle().compareToIgnoreCase(book2.getTitle());
    }
}

class BookSortingExample {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "The Great Gatsby", 1925));
        books.add(new Book(2, "To Kill a Mockingbird", 1960));
        books.add(new Book(3, "1984", 1949));
        books.add(new Book(4, "Pride and Prejudice", 1813));
        books.add(new Book(5, "Brave New World", 1932));

        
        Collections.sort(books, new ByPublicationYearComparator());
        System.out.println("Sorted by publication year:");
        for (Book book : books) {
            System.out.println(book);
        }

        
        Collections.sort(books, new ByTitleComparator());
        System.out.println("\nSorted by title:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
