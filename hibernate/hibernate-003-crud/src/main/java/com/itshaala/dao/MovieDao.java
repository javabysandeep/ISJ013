package com.itshaala.dao;

import com.itshaala.model.Movie;
import com.itshaala.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class MovieDao {
    public void addMovie(Movie movie) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(movie);
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("Movie added successfully");
    }

    public void updateMovie(Movie movie) {
        //save, update, saveOrUpdate ---> hibernate old version
        //persist, merge ---> hibernate new version
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //transaction is required for non-select queries
        Transaction transaction = session.beginTransaction();
        Movie fetchedMovie = session.find(Movie.class, movie.getId());
        if (fetchedMovie != null) {
            session.merge(movie);
            System.out.println("Movie updated successfully");
            transaction.commit();
        } else {
            System.out.println("Movie not found");
        }
        session.close();
        sessionFactory.close();

    }

    public void deleteMovie(Movie movie) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        //transaction is required for non-select queries
        Movie fetchedMovie = session.find(Movie.class, movie.getId());
        if (fetchedMovie != null) {
            Transaction transaction = session.beginTransaction();
            session.remove(movie);
            System.out.println("Movie deleted successfully");
            transaction.commit();
        } else {
            System.out.println("Movie not found");
        }
        session.close();
    }

    public Movie getMovieById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Movie fetchedMovie = session.find(Movie.class, id);
        session.close();
        return fetchedMovie;
    }

    public List<Movie> getAllMovies() {
        return null;
    }
}
   // Spring Data JPA ---> interface MovieRepo extends JpaRepositoty<Movie,Integer>{}
