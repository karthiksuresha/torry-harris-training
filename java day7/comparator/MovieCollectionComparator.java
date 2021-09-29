package com.Day7.comparator;

import com.Day7.model.Movie;

import java.util.Comparator;

public class MovieCollectionComparator implements Comparator <Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        return o2.getCollection().compareTo(o1.getCollection());
    }
}

