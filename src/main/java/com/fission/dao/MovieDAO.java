package com.fission.dao;

import java.util.List;

import com.fission.beans.Movie;

public interface MovieDAO {

	public void addMovie(Movie m);
	public void updateMovie(Movie m);
	public List<Movie> listMovies();
	public Movie getMovieById(int id);
	public void removeMovie(int id);
}
