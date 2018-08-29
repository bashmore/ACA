package com.aca.rest.dao;

import java.util.ArrayList;
import java.util.List;

import com.aca.rest.model.Genre;
import com.aca.rest.model.Movie;

public class MovieDao {

	private static List<Movie> movies = new ArrayList<Movie>();
	
	static {
		movies.add(new Movie("The World Is Not Enough",Genre.ACTION,1982,"a1"));
		movies.add(new Movie("Star Trek",Genre.SYFY,2002,"a2"));
		movies.add(new Movie("Mean Girls",Genre.COMEDY,2008,"a3"));
		movies.add(new Movie("The Waterboy",Genre.COMEDY, 1998, "a4"));
		movies.add(new Movie("The Godfather",Genre.ACTION, 1972, "a5"));
	}
	
	public static List<Movie> getAllMovies() {
		
		List<Movie> movies = new ArrayList<Movie>();
		movies.addAll(MovieDao.movies);
		
		return movies;
	}
	
	public static List<Movie> getByGenre(Genre genre) {
		List<Movie> myMovies = new ArrayList<Movie>();
		
		for (Movie movie : MovieDao.movies) {
			if (movie.getGenre().equals(genre)) {
				myMovies.add(movie);
				
			}
		}
		
		return myMovies;
	}
	
	public static List<Movie> getByReleaseYear(int year) {
		List<Movie> myMovies = new ArrayList<Movie>();
		
		for (Movie movie : MovieDao.movies) {
			if (movie.getReleaseYear() == (year)) {
				myMovies.add(movie);
			}
		}
		
		return myMovies;
	}
	
	public static Movie getMovieByEidr(String eidr) {
		for (Movie movie : MovieDao.movies) {
			if (movie.getEidr().equals(eidr)) {
				return movie;
				
			}
		}
		return null;
	}
	
	public static boolean addMovie(Movie newMovie) {
		boolean added = false;
		
		synchronized (MovieDao.movies) {
			Movie movie = MovieDao.getMovieByEidr(newMovie.getEidr());
			if (null == movie) {
				MovieDao.movies.add(newMovie);
				added = true;
			}
		}		
		return added;
	}
	
	
	public static void updateMovie(Movie updateMovie) {
		for (Movie movie : MovieDao.movies) {
			if (movie.getEidr().equals(updateMovie.getEidr())) {
				MovieDao.movies.remove(movie);
				MovieDao.movies.add(updateMovie);
				break;
			}					
	}		
}

	public static Movie deleteMovieByEidr(String eidr) {
		Movie foundMovie = null;
		
		for (Movie movie : MovieDao.movies) {
			if (movie.getEidr().equals(eidr)) {
				
				MovieDao.movies.remove(movie);
				foundMovie = movie;
				break;
			}
		}
		return foundMovie;
	}
}

