package com.poc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class MovieEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String movieName;

	private String moviePrice;

	private Boolean bookIsConfirm;

	private String seatNo;
	private String bookingStatus;
	
	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public String getTicketRef() {
		return ticketRef;
	}

	public void setTicketRef(String ticketRef) {
		this.ticketRef = ticketRef;
	}

	private String ticketRef;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMoviePrice() {
		return moviePrice;
	}

	public void setMoviePrice(String moviePrice) {
		this.moviePrice = moviePrice;
	}

	public Boolean getBookIsConfirm() {
		return bookIsConfirm;
	}

	public void setBookIsConfirm(Boolean bookIsConfirm) {
		this.bookIsConfirm = bookIsConfirm;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

}
