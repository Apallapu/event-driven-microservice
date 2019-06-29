package com.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.model.Movie;
import com.poc.service.MovieService;

@RestController
public class MovieController {
	
	@Autowired
	MovieService movieService;
	@PostMapping("/create-movie")
	public Movie createMovie(@RequestBody Movie movie) {
		return movieService.createMovie(movie);
		
		
	}
	
	

}
