package com.poc.model;

public class Movie {

	private Long id;

	private String movieName;

	private String moviePrice;

	private Boolean bookIsConfirm;

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
