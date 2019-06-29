package com.poc.model;

public class MovieRequest {

	private Long id;

	private String movieName;

	private String moviePrice;
	private String ticketRef;

	public String getTicketRef() {
		return ticketRef;
	}

	public void setTicketRef(String ticketRef) {
		this.ticketRef = ticketRef;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	private Boolean bookIsConfirm;
	
	private String bookingStatus;

	private String seatNo;

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
