package com.itshaala;

import com.itshaala.controller.MovieController;
import com.itshaala.model.Movie;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        MovieController controller = new MovieController();
        Movie movie = new Movie();
//        movie.setId(1);
        movie.setTitle("Sitare Jameen par kaise aye");
        movie.setYear("2005");
        movie.setGenre("Action");
        movie.setDirector("Mr.Sandeep");
        movie.setActors(List.of("Pritam", "Pravin", "Sumit", "Komal", "Shital"));
        controller.addMovie(movie);
    }
}
