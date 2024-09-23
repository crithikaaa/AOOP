package com.moviedb;

import java.util.Comparator;

public class MovieComparator {
    public static Comparator<Movie> sortByReleaseYear = new Comparator<Movie>() {
        @Override
        public int compare(Movie m1, Movie m2) {
            return Integer.compare(m1.getReleaseYear(), m2.getReleaseYear());
        }
    };

    public static Comparator<Movie> sortByRating = new Comparator<Movie>() {
        @Override
        public int compare(Movie m1, Movie m2) {
            return Double.compare(m1.getRating(), m2.getRating());
        }
    };
}
