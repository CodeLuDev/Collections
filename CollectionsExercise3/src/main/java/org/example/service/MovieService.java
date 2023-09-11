package org.example.service;

import org.example.entity.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieService {

    List<Movie> moviesList;

    public MovieService() {
        moviesList = new ArrayList<>();
    }

    public List<Movie> getMoviesList() {
        return moviesList;
    }

    public Movie createMovie() {
        return new Movie();
    }

    public void addMovieToList(Movie movie) {
        moviesList.add(movie);
    }

    public void showAllMovies() {
        System.out.println("\nAll movies");

        for (Movie movie : moviesList) {
            System.out.println("Movie title: "+movie.getTitle() + ", movie director: " + movie.getDirector() + ", movie duration: " + movie.getDuration());
        }
    }

    public void moviesDurationMoreOneH() {
        System.out.println("\nMovie duration more than 1 hour");

        for (Movie movie : moviesList) {
            if (movie.getDuration() > 1) {
                System.out.println("Movie title: "+movie.getTitle() + ", movie director: " + movie.getDirector() + ", movie duration: " + movie.getDuration());
            }
        }
    }

    public void moviesLongestToShortestDuration() {
        System.out.println("\nMovie sorted from longest to shortest duration");

        Collections.sort(moviesList, new Comparator<Movie>() {
            @Override
            public int compare(Movie movie1, Movie movie2) {
                return Integer.compare(movie2.getDuration(),movie1.getDuration());
            }
        });

        for (Movie movie : moviesList) {
            System.out.println("Movie title: "+movie.getTitle() + ", movie director: " + movie.getDirector() + ", movie duration: " + movie.getDuration());
        }
    }

    public void moviesShortestToLongestDuration() {
        System.out.println("\nMovie duration from shortest to longest");

        Collections.sort(moviesList, new Comparator<Movie>() {
            @Override
            public int compare(Movie movie1, Movie movie2) {
                return Integer.compare(movie1.getDuration(),movie2.getDuration());
            }
        });

        for (Movie movie : moviesList) {
            System.out.println("Movie title: "+movie.getTitle() + ", movie director: " + movie.getDirector() + ", movie duration: " + movie.getDuration());
        }
    }

    public void moviesSortedTitleAlphabetically() {
        System.out.println("\nMovie duration sort title alphabetically");

        Collections.sort(moviesList, new Comparator<Movie>() {
            @Override
            public int compare(Movie movie1, Movie movie2) {
                return movie1.getTitle().compareTo(movie2.getTitle());
            }
        });

        for (Movie movie : moviesList) {
            System.out.println("Movie title: "+movie.getTitle() + ", movie director: " + movie.getDirector() + ", movie duration: " + movie.getDuration());
        }
    }

    public void moviesSortedDirectorAlphabetically() {
        System.out.println("\nMovie duration sort director alphabetically");

        Collections.sort(moviesList, new Comparator<Movie>() {
            @Override
            public int compare(Movie movie1, Movie movie2) {
                return movie1.getDirector().compareTo(movie2.getDirector());
            }
        });

        for (Movie movie : moviesList) {
            System.out.println("Movie title: "+movie.getTitle() + ", movie director: " + movie.getDirector() + ", movie duration: " + movie.getDuration());
        }
    }
}
