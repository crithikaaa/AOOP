package movieapp;

import java.util.Collections;
import java.util.List;

public class MovieSorter {
	 public static List<Movie> sortMoviesByYear(List<Movie> movies) {
	        Collections.sort(movies);  
	        return movies;
	    }
}
