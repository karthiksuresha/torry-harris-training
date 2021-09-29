package com.Day7.driver;

import com.Day7.comparator.MovieCollectionComparator;
import com.Day7.comparator.MovieYearComparator;
import com.Day7.comparator.MovieimdbRatingComparator;
import com.Day7.model.Movie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MovieDemo {
    public static void main(String[] args) {

        Movie m1 = new Movie("Ranna",2016,7.5f,55.6f);
        Movie m2 = new Movie("KGF",2019,9.5f,120.74f);
        Movie m3 = new Movie("Kurukshetra",2019,8f,80.2f);
        Movie m4 = new Movie("Jems",2020,8.5f,70.6f);
        Movie m5 = new Movie("Inspector Vikram",2020,7.5f,65.8f);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(m1);
        movieList.add(m2);
        movieList.add(m3);
        movieList.add(m4);
        movieList.add(m5);

        Iterator<Movie> movieIterator = movieList.iterator();
            while (movieIterator.hasNext()) {
                System.out.println(movieIterator.next());
            }
        System.out.println("1:Title\n2:Year\n3:IMdbrating\n4:collaction\nEnter the choice to sort");
    Scanner scanner = new Scanner(System.in);
    int o=scanner.nextInt();
        if(o==1) {
            System.out.println("\n---------After sorting by Title---------\n");

            movieList.sort(null);
            movieIterator = movieList.iterator();
            while (movieIterator.hasNext()) {
                System.out.println(movieIterator.next());
            }
        }
        else if(o==2) {
            System.out.println("\n---------After sorting by Year---------\n");

            movieList.sort(new MovieYearComparator());
            movieIterator = movieList.iterator();
            while (movieIterator.hasNext()) {
                System.out.println(movieIterator.next());
            }
        }
        else if(o==3) {
            System.out.println("\n---------After sorting by IMdbRating---------\n");

            movieList.sort(new MovieimdbRatingComparator());
            movieIterator = movieList.iterator();
            while (movieIterator.hasNext()) {
                System.out.println(movieIterator.next());
            }
        }
        else if(o==4) {
            System.out.println("\n---------After sorting by Collection---------\n");

            movieList.sort(new MovieCollectionComparator());
            movieIterator = movieList.iterator();
            while (movieIterator.hasNext()) {
                System.out.println(movieIterator.next());
            }
        }
    }
}
