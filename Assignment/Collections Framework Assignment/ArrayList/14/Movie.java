/* 14. Movie Collection:
Write a Java program to create an ArrayList of Movie objects. Each Movie object should 
have properties such as title, genre, and year. Add five movies to the list, sort them by 
year, and display the sorted list. */ 


import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie> {
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

    @Override
    public String toString() {
        return "Title: " + title + ", Genre: " + genre + ", Year: " + year;
    }

    @Override
    public int compareTo(Movie other) {
        return Integer.compare(this.year, other.year);
    }
}

class MovieCollection {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", "Sci-Fi", 2010));
        movies.add(new Movie("The Godfather", "Crime", 1972));
        movies.add(new Movie("The Dark Knight", "Action", 2008));
        movies.add(new Movie("Pulp Fiction", "Crime", 1994));
        movies.add(new Movie("The Shawshank Redemption", "Drama", 1994));

        Collections.sort(movies);

        System.out.println("Sorted list of movies by year:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
