package com.aca.rest.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.aca.rest.model.Movie;
import com.aca.rest.service.MovieService;

@Path("/movies")
public class MovieController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Movie> getAllMovies() {

		return MovieService.getAllMovies();
	}

	@GET
	@Path("/genre/{value}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Movie> getByGenre(@PathParam("value") String genre) {

		return MovieService.getByGenre(genre);
	}

	@GET
	@Path("/releaseYear/{value}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Movie> getByReleaseYear(@PathParam("value") int year) {

		return MovieService.getByReleaseYear(year);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Movie addMovies(Movie movie) {

		System.out.println("new movie: " + movie.toString());
		MovieService.addMovies(movie);

		return movie;
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Movie updateMovie(Movie movie) {

		System.out.println("new movie: " + movie.toString());
		MovieService.updateMovies(movie);

		return movie;
	}

	@DELETE
	@Path("/{eidrvalue}")
	@Produces(MediaType.APPLICATION_JSON)
	public Movie deleteMovie(@PathParam("eidrvalue") String eidr) {

		Movie movie = MovieService.deleteMovie(eidr);

		return movie;
	}
}
