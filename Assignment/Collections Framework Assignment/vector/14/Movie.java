/* 14. Movie Collection:
Write a Java program to create a Vector of Movie objects. Each Movie object should have 
properties such as title, genre, and year. Add five movies to the vector, sort them by year, and 
display the sorted vector. */ 

 import java.util.Vector;
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

    @Override
    public String toString() {
        return "Movie{" +"title='" + title + '\'' +", genre='" + genre + '\'' +", year=" + year +'}';
    }
}
class MovieYearComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return Integer.compare(m1.getYear(), m2.getYear());
    }
}

class MovieCollection {
    public static void main(String[] args) {
        
        Vector<Movie> movieVector = new Vector<>();

       
        movieVector.add(new Movie("Inception", "Science Fiction", 2010));
        movieVector.add(new Movie("The Shawshank Redemption", "Drama", 1994));
        movieVector.add(new Movie("Pulp Fiction", "Crime", 1994));
        movieVector.add(new Movie("The Dark Knight", "Action", 2008));
        movieVector.add(new Movie("Forrest Gump", "Drama", 1994));

        
        Collections.sort(movieVector, new MovieYearComparator());

       
        System.out.println("Sorted Movie Collection:");
        for (Movie movie : movieVector) {
            System.out.println(movie);
        }
    }
}




