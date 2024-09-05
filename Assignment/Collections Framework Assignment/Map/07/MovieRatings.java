/* 7. Sorting a Map by Keys:
Write a Java program to create a TreeMap of String keys and Double values representing 
movie titles and their ratings. Add five movie-rating pairs to the map. Display the 
map sorted by keys (movie titles). */ 

import java.util.*;

class Movie implements Comparable<Movie> {
    private String title;
    private double rating;

    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public int compareTo(Movie otherMovie) {
        // Compare based on movie titles (lexicographically)
        return this.title.compareTo(otherMovie.title);
    }

    @Override
    public String toString() {
        return title + ": " + rating;
    }
}

public class MovieRatings {
    public static void main(String[] args) {
        // Create a TreeMap with custom sorting based on Movie objects
        TreeMap<Movie, Integer> movieRatings = new TreeMap<>();

        // Add five movie-rating pairs
        movieRatings.put(new Movie("Inception", 8.7), 1);
        movieRatings.put(new Movie("The Shawshank Redemption", 9.3), 2);
        movieRatings.put(new Movie("Pulp Fiction", 8.9), 3);
        movieRatings.put(new Movie("The Dark Knight", 9.0), 4);
        movieRatings.put(new Movie("Forrest Gump", 8.8), 5);

        // Display the map sorted by movie titles
        System.out.println("Movie ratings (sorted by title):");
        for (Map.Entry<Movie, Integer> entry : movieRatings.entrySet()) {
            System.out.println(entry.getKey() + " (Position: " + entry.getValue() + ")");
        }
    }
}


