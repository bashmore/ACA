package com.aca.rest.service;

import java.util.List;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import com.aca.rest.dao.MovieDao;
import com.aca.rest.model.Movie;
import com.aca.rest.model.Error;
import com.aca.rest.model.Genre;

public class MovieService {

	public static List<Movie> getAllMovies() {

		return MovieDao.getAllMovies();
	}
	
	public static List<Movie> getByGenre(String genreString) {
		Genre genre = validateGenre(genreString);
		
		return MovieDao.getByGenre(genre);
	}
	
	public static List<Movie> getByReleaseYear(int year) {

		return MovieDao.getByReleaseYear(year);
	}
	
	private static Genre validateGenre(String genreString) {
		
		boolean isValid = Genre.isValid(genreString);
		
		if (isValid) {
			return Genre.valueOf(genreString.toUpperCase());
		} else {
	
			Error error = new Error(123, "invalid value for genre " + "'" + genreString + "'" + ", valid values are: 'action', 'syfy', and 'comedy'");
					
			Response response = Response.status(400)
					.entity(error)
					.build();
			throw new WebApplicationException(response);
		}
	}
	
	//add movie
	//if key is unique
	//genre is valid
	//release year is good
	//else throw error
	
	public static void addMovies(Movie newMovie) {
		boolean isAdded = MovieDao.addMovie(newMovie);
		
		if (!isAdded) {
			Error error = new Error(124, "'invalid value for EIDR' " + newMovie.getEidr() + "', value must be unique");
			
			Response response = Response.status(400)
					.entity(error)
					.build();
			throw new WebApplicationException(response);			
		}
		
	}

	public static void updateMovies(Movie updateMovie) {
		Movie movie = MovieDao.getMovieByEidr(updateMovie.getEidr());
		
		if (movie != null) {
			MovieDao.addMovie(updateMovie);
		} else {
			
		}
		
	}

	public static Movie deleteMovie(String eidr) {

		return MovieDao.deleteMovieByEidr(eidr);
		
	}
}
