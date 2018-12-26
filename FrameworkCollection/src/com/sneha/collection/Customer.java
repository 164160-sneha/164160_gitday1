package com.sneha.collection;

public class Customer {
	
	public static void main(String[] args) {
		

		MovieDetailsList movieDetailsList=new MovieDetailsList();
		movieDetailsList.addMovie(new Movie_Details("Bobygaurd","Salman Khan","Kareena","Action"));
		movieDetailsList.addMovie(new Movie_Details("RaOne","Shahruk Khan","Kareena","Romantic"));
		movieDetailsList.addMovie(new Movie_Details("Tiger","Salman Khan","Katrina","Spy"));
		movieDetailsList.addMovie(new Movie_Details("Hum sath sath hai","Salman Khan","Sonali","Romantic"));
		
		
		System.out.println(movieDetailsList.findMovieByMovieName("Dabang"));
		System.out.println(movieDetailsList.findMovieByGenre("Action"));
		System.out.println(movieDetailsList.removeMovie(new Movie_Details("Dabang2","Salman Khan","Sonakshi Sinha","Action")));
		movieDetailsList.display();
		movieDetailsList.sort("leadActories");
		movieDetailsList.display();
	}


}
