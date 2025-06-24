package com.itshaala.service;

import com.itshaala.dao.MovieDao;
import com.itshaala.model.Movie;

import java.util.List;


public class MovieService {
    private MovieDao movieDao = new MovieDao();

    public void addMovie(Movie movie) {
        movieDao.addMovie(movie);
    }

    public void updateMovie(Movie movie) {
        movieDao.updateMovie(movie);
    }

    public void deleteMovie(Movie movie) {
        movieDao.deleteMovie(movie);
    }

    public Movie getMovieById(int id) {
        return movieDao.getMovieById(id);

    }

    public List<Movie> getAllMovies() {
        return movieDao.getAllMovies();
    }
}
