/* 14. Movie Collection:
Write a Java program to create a LinkedList of Movie objects. Each Movie object should 
have properties such as title, genre, and year. Add five movies to the list, sort them by 
year, and display the sorted list.
 */ 
 
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;

class Movie {
    private String title;
    private String genre;
    private int year;

    public Movie(String title, String genre, int year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }
}

class MovieYearComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return Integer.compare(movie1.getYear(), movie2.getYear());
    }
}

class MovieCollection {
    public static void main(String[] args) {
        LinkedList<Movie> movieList = new LinkedList<>();

        // Add movies
        movieList.add(new Movie("Inception", "Science Fiction", 2010));
        movieList.add(new Movie("The Dark Knight", "Action", 2008));
        movieList.add(new Movie("Pulp Fiction", "Crime", 1994));
        movieList.add(new Movie("The Shawshank Redemption", "Drama", 1994));
        movieList.add(new Movie("Forrest Gump", "Drama", 1994));

        // Sort movies by year using a custom comparator
        Collections.sort(movieList, new MovieYearComparator());

        // Display the sorted list
        System.out.println("Sorted movie list by year:");
        for (Movie movie : movieList) {
            System.out.println(movie.getTitle() + " (" + movie.getYear() + ") - " + movie.getGenre());
        }
    }
}


