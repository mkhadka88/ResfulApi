package com.khadka.RestfulAPI;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController

@RequestMapping(value = "/api")
public class RestController {
	@GetMapping(value ="/movie")
	public ResponseEntity<MovieListResponse> getMovieDetails(){
		
		MovieListResponse response = new MovieListResponse();
		response.setStatus("Success");
		
		List<MovieResponse> movie = new ArrayList<>();
		MovieResponse movie1 = new MovieResponse();
		movie1.setMovieName("Terminator");
		movie1.setRating("8.8");
		movie1.setYear("1990");
		
		movie.add(movie1);
		
		MovieResponse movie2 = new MovieResponse();
		movie2.setMovieName("The Resident");
		movie2.setRating("5.6");
		movie2.setYear("2011");
		
		movie.add(movie2);
		
		
		response.setData(movie);
		
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}
	@GetMapping(value ="/movie/{movieYear}")
	
	public ResponseEntity<MovieService> getMovieById(@PathVariable String movieYear){
		
		
		MovieResponse movie3 = new MovieResponse();
		movie3.setMovieName("Aladdin");
		movie3.setRating("5.5");
		movie3.setYear(movieYear);
		
		
		MovieService response = new MovieService();
		response.setStatus("Success");
		response.setData(movie3);
		
		
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@PostMapping(value="/create")
	public ResponseEntity<MovieService> createMovie(@RequestBody String MovieResponse){
		MovieResponse movie4 = new MovieResponse();
		movie4.setMovieName("LionHeart");
		movie4.setRating("7");
		movie4.setYear("1990");
		
		MovieService response = new MovieService();
		response.setStatus("Success");
		response.setData(movie4);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@PutMapping(value ="/update/{movieId}")
	public ResponseEntity<MovieService> updateMovieId(@PathVariable String movieId, @RequestBody String MovieResponse)
	{
		MovieResponse movie5 = new MovieResponse();
		movie5.setMovieName("Vastavz");
		movie5.setRating("8.5");
		movie5.setYear(movieId);
		
		MovieService response = new MovieService();
		response.setStatus("Success");
		response.setData(movie5);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@DeleteMapping(value ="/delete/{movieId}")
	public ResponseEntity<String> deleteMovie(){
		return new ResponseEntity<String> ("Successfully Deleted", HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
