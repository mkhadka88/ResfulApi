package com.khadka.RestfulAPI;

public class MovieResponse {

	private String movieName;
	private String rating;
	private String year;
	public MovieResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MovieResponse(String movieName, String rating, String year) {
		super();
		this.movieName = movieName;
		this.rating = rating;
		this.year = year;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	
	
}
