package movieapp;import java.util.ArrayList;
import java.util.List;
public class Main {
	 public static void main(String[] args) {
	        
	        List<Movie> movies = new ArrayList<>();
	        movies.add(new Movie("Igloo", 8.8, 2010));
	        movies.add(new Movie("The God", 9.2, 1972));
	        movies.add(new Movie("sellar", 8.6, 2014));
	        movies.add(new Movie("Fiction", 8.9, 1994));

	       
	        MovieSorter.sortMoviesByYear(movies);

	        System.out.println("Movies sorted by year of release:");
	        for (Movie movie : movies) {
	            System.out.println(movie);
	        }
	    }
}
