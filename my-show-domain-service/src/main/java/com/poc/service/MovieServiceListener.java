package com.poc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.poc.model.MovieEntity;
import com.poc.model.MovieRequest;

@Service
public class MovieServiceListener {

	@Autowired
	JmsTemplate jmsTemplate;
	@Autowired
	MovieService movieService;

	@JmsListener(destination = "movieTopicConfirm", containerFactory = "myFactory")
	public void receiveMessage(MovieRequest movie) {

		

		MovieEntity movieRequest = new MovieEntity();

			movieRequest.setBookIsConfirm(Boolean.TRUE);
			movieRequest.setMovieName(movie.getMovieName());
			movieRequest.setMoviePrice(movie.getMoviePrice());
			movieRequest.setSeatNo(movie.getSeatNo());
			movieRequest.setBookingStatus("Booking is confirmed");
			movieService.createTicket(movieRequest);
			
		}

	}

