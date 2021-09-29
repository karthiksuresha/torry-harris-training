package com.Day7.comparator;

import com.Day7.model.Movie;

import java.util.Comparator;

public class MovieYearComparator implements Comparator <Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getYear()- o2.getYear();
    }
}
