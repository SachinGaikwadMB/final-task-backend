package com.mb.api.web.dto;

public class ShowDetailsDto
{
	private String email;

	private String movieName;

	private String showTime;

	private Integer totalSeats;

	private Double totalPrice;

	private String bookedSeats;

	public String getEmail()
	{
		return email;
	}

	public String getMovieName()
	{
		return movieName;
	}

	public String getShowTime()
	{
		return showTime;
	}

	public Integer getTotalSeats()
	{
		return totalSeats;
	}

	public Double getTotalPrice()
	{
		return totalPrice;
	}

	public String getBookedSeats()
	{
		return bookedSeats;
	}
	
	
}
