package entity;

import org.example.entity.Movie;
import org.example.service.MovieService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MovieTest {

    @Test
    public void verifyCreateMovieTest() {

        MovieService movieService = new MovieService();

        //first movie
        Movie movie1 = movieService.createMovie();
        movie1.setTitle("Barbie");
        movie1.setDirector("Greta Gerwig");
        movie1.setDuration(2);

        Assertions.assertEquals("Barbie", movie1.getTitle());
        Assertions.assertEquals("Greta Gerwig", movie1.getDirector());
        Assertions.assertEquals(2, movie1.getDuration());

        //second movie
        Movie movie2 = movieService.createMovie();
        movie2.setTitle("Oppenheimer");
        movie2.setDirector("Christopher Nolan");
        movie2.setDuration(3);

        Assertions.assertEquals("Oppenheimer", movie2.getTitle());
        Assertions.assertEquals("Christopher Nolan", movie2.getDirector());
        Assertions.assertEquals(3, movie2.getDuration());
    }

    @Test
    public void verifyAddMovieTest() {

        MovieService movieService = new MovieService();

        //first movie
        Movie movie1 = movieService.createMovie();
        movie1.setTitle("Barbie");
        movie1.setDirector("Greta Gerwig");
        movie1.setDuration(2);

        movieService.addMovieToList(movie1);

        //second movie
        Movie movie2 = movieService.createMovie();
        movie2.setTitle("Oppenheimer");
        movie2.setDirector("Christopher Nolan");
        movie2.setDuration(3);

        movieService.addMovieToList(movie2);

        Assertions.assertEquals(2, movieService.getMoviesList().size());
    }

    @Test
    public void verifyShowAllMoviesTest() {

        MovieService movieService = new MovieService();

        //first movie
        Movie movie1 = new Movie();
        movie1.setTitle("Barbie");
        movie1.setDirector("Greta Gerwig");
        movie1.setDuration(2);
        movieService.addMovieToList(movie1);

        //second movie
        Movie movie2 = new Movie();
        movie2.setTitle("Oppenheimer");
        movie2.setDirector("Christopher Nolan");
        movie2.setDuration(3);
        movieService.addMovieToList(movie2);

        movieService.showAllMovies();

        Assertions.assertEquals(2, movieService.getMoviesList().size());
        Assertions.assertTrue(movieService.getMoviesList().get(0).equals(movie1));
        Assertions.assertTrue(movieService.getMoviesList().get(1).equals(movie2));
    }

    @Test
    public void verifyMoviesDurationMoreOneHTest() {

        MovieService movieService = new MovieService();

        //first movie
        Movie movie1 = new Movie();
        movie1.setTitle("Barbie");
        movie1.setDirector("Greta Gerwig");
        movie1.setDuration(2);
        movieService.addMovieToList(movie1);

        //second movie
        Movie movie2 = new Movie();
        movie2.setTitle("Oppenheimer");
        movie2.setDirector("Christopher Nolan");
        movie2.setDuration(3);
        movieService.addMovieToList(movie2);

        movieService.moviesDurationMoreOneH();

        Assertions.assertTrue(movieService.getMoviesList().get(0).getDuration() > 1);
        Assertions.assertTrue(movieService.getMoviesList().get(1).getDuration() > 1);
    }

    @Test
    public void verifyMoviesLongestToShortestDurationTest() {

        MovieService movieService = new MovieService();

        //first movie
        Movie movie1 = new Movie();
        movie1.setTitle("Barbie");
        movie1.setDirector("Greta Gerwig");
        movie1.setDuration(2);
        movieService.addMovieToList(movie1);

        //second movie
        Movie movie2 = new Movie();
        movie2.setTitle("Oppenheimer");
        movie2.setDirector("Christopher Nolan");
        movie2.setDuration(3);
        movieService.addMovieToList(movie2);

        movieService.moviesLongestToShortestDuration();

        Assertions.assertEquals("Oppenheimer", movieService.getMoviesList().get(0).getTitle());
        Assertions.assertTrue(movieService.getMoviesList().get(0).getDuration() > movie1.getDuration());
    }

    @Test
    public void verifyMoviesShortestToLongestDurationTest() {

        MovieService movieService = new MovieService();

        //first movie
        Movie movie1 = new Movie();
        movie1.setTitle("Barbie");
        movie1.setDirector("Greta Gerwig");
        movie1.setDuration(2);
        movieService.addMovieToList(movie1);

        //second movie
        Movie movie2 = new Movie();
        movie2.setTitle("Oppenheimer");
        movie2.setDirector("Christopher Nolan");
        movie2.setDuration(3);
        movieService.addMovieToList(movie2);

        movieService.moviesShortestToLongestDuration();

        Assertions.assertEquals("Barbie", movieService.getMoviesList().get(0).getTitle());
        Assertions.assertTrue(movieService.getMoviesList().get(0).getDuration() < movie2.getDuration());
    }

    @Test
    public void verifyMoviesSortTitleAlphabeticallyTest() {

        MovieService movieService = new MovieService();

        //first movie
        Movie movie1 = new Movie();
        movie1.setTitle("Barbie");
        movie1.setDirector("Greta Gerwig");
        movie1.setDuration(2);
        movieService.addMovieToList(movie1);

        //second movie
        Movie movie2 = new Movie();
        movie2.setTitle("Oppenheimer");
        movie2.setDirector("Christopher Nolan");
        movie2.setDuration(3);
        movieService.addMovieToList(movie2);

        movieService.moviesSortedTitleAlphabetically();

        Assertions.assertEquals("Barbie", movieService.getMoviesList().get(0).getTitle());
    }

    @Test
    public void verifyMoviesSortDirectorAlphabeticallyTest() {

        MovieService movieService = new MovieService();

        //first movie
        Movie movie1 = new Movie();
        movie1.setTitle("Barbie");
        movie1.setDirector("Greta Gerwig");
        movie1.setDuration(2);
        movieService.addMovieToList(movie1);

        //second movie
        Movie movie2 = new Movie();
        movie2.setTitle("Oppenheimer");
        movie2.setDirector("Christopher Nolan");
        movie2.setDuration(3);
        movieService.addMovieToList(movie2);

        movieService.moviesSortedDirectorAlphabetically();

        Assertions.assertTrue(movieService.getMoviesList().get(0).getDirector().equals("Christopher Nolan"));
    }
}
