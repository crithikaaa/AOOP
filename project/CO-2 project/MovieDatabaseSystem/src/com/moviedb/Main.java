package com.moviedb;

import java.util.Collections;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Movie movie1 = new Movie("Inception", "Christopher Nolan", 2010, 8.8);
        Movie movie2 = new Movie("The Matrix", "Lana Wachowski", 1999, 8.7);
        Movie movie3 = new Movie("Interstellar", "Christopher Nolan", 2014, 8.6);

        // Adding movies to collection
        MovieCollection collection = new MovieCollection();
        collection.addMovie(movie1);
        collection.addMovie(movie2);
        collection.addMovie(movie3);

        // Sorting by title using Comparable
        System.out.println("Movies sorted by title:");
        Collections.sort(collection.getMovies());
        for (Movie movie : collection) {
            System.out.println(movie);
        }

        // Sorting by release year using Comparator
        System.out.println("\nMovies sorted by release year:");
        Collections.sort(collection.getMovies(), MovieComparator.sortByReleaseYear);
        for (Movie movie : collection) {
            System.out.println(movie);
        }

        // Cloning a movie
        Movie clonedMovie = movie1.clone();
        System.out.println("\nCloned movie: " + clonedMovie);
    }
}
