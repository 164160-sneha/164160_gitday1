package com.sneha.collection;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.Collections;
import java.util.Comparator;


public class MovieDetailsList {
	ArrayList<Movie_Details> movies;

	public MovieDetailsList() {
		super();
		if(movies==null)
			movies=new ArrayList<Movie_Details>();
	}
	
	public boolean addMovie(Movie_Details movie){
		
		return movies.add(movie);
		
	}
	
	public boolean removeMovie(Movie_Details movie){
		return movies.remove(movie);
	}
	
	public void removeAllMovies(){
		movies.clear();
		
	}
	
	public void sort(String type) {
	
		Collections.sort(movies, new Comparator<Movie_Details>() {

			@Override
			public int compare(Movie_Details arg0, Movie_Details arg1) {
				
				if(type.equals("genre"))
					return arg0.getGenre().compareTo(arg1.getGenre());
				else if(type.equals("leadActor"))
					return arg0.getLeadActor().compareTo(arg1.getLeadActor());
				else if(type.equals("leadActories"))
					return arg0.getLeadActories().compareTo(arg1.getLeadActories());
				else
					return arg0.getMovieName().compareTo(arg1.getMovieName());
					
			}
		});
	}
	
	
	public String findMovieByMovieName(String movieName){
		
		Iterator<Movie_Details> iterator= movies.iterator();
		
		while(iterator.hasNext()){
			
			Movie_Details movieDetail=iterator.next();
			if(movieName.equals(movieDetail.getMovieName()))
				return movieDetail.toString();
		}
		return null;
	}
	
public String findMovieByGenre(String genre){
		
		Iterator<Movie_Details> iterator= movies.iterator();
		String allMovies="";
		while(iterator.hasNext()){
			Movie_Details movieDetail=iterator.next();
			if(genre.equals(movieDetail.getGenre()))
				allMovies+="\n"+ movieDetail.toString()+"\n";
		}
		return allMovies;
	}
	
	public void display() {

		Iterator<Movie_Details> iterator= movies.iterator();
	
		while(iterator.hasNext()){
			Movie_Details movieDetail=iterator.next();
			System.out.println(movieDetail.toString()+"\n");
		}
	}

}
