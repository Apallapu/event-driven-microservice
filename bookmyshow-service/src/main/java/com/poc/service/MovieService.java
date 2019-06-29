package com.poc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.poc.model.Movie;

@Service
public class MovieService {

	
	@Autowired
	JmsTemplate jmsTemplate;
	public Movie createMovie(Movie movie) {
		jmsTemplate.convertAndSend("movieTopic", movie);
		return new Movie();
	}

}
