package com.sneha.collection;

import java.util.ArrayList;

public class MovieList {
	ArrayList<Movie> movies = new ArrayList<Movie>();

	public MovieList(ArrayList<Movie> movies) {
		super();
		this.movies = movies;
	}
	
	public void addMovie(Movie movie){
		return movies.add(movie);
	}
	
	public void removeMovie(){
		this.removeMovie();
	}
	
	public void removeAllMovie(){
		this.removeAllMovie();
	}
	public void findMovieByName(){
		this.findMovieByName();
	}
	public void findMovieByGenre(){
		this.findMovieByGenre();
	}
	
	public static void main(String[] args) {
		
	}

}
