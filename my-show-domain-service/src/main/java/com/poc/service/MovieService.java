package com.poc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.model.MovieEntity;
import com.poc.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository movieRepository;

	public void createTicket(MovieEntity movieRequest) {
		movieRepository.save(movieRequest);

	}

}
