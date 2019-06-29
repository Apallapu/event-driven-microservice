package com.poc.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.poc.model.Movie;
import com.poc.model.MovieRequest;

@Service
public class PaymentServiceListener {

	@Autowired
	JmsTemplate jmsTemplate;

	@JmsListener(destination = "movieTopic", containerFactory = "myFactory")
	public void receiveMessage(Movie movie) {

		if (!movie.getBookIsConfirm()) {

			MovieRequest movieRequest = new MovieRequest();

			movieRequest.setBookIsConfirm(Boolean.TRUE);
			movieRequest.setMovieName(movie.getMovieName());
			movieRequest.setMoviePrice(movie.getMoviePrice());
			movieRequest.setSeatNo(movie.getSeatNo());
			movieRequest.setBookingStatus("payment confirmed");
			movieRequest.setTicketRef(UUID.randomUUID().toString());
			jmsTemplate.convertAndSend("movieTopicConfirm", movieRequest);
			
		}

	}
}
