package com.mb.api.persistance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booked_details")
public class BookedDetails
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "movie_name")
	private String movieName;
	
	@Column(name = "show_time")
	private String showTime;
	
	@Column(name = "total_seats")
	private Integer totalSeats;
	
	@Column(name = "total_price")
	private Double totalPrice;
	
	@Column(name = "booked_seats")
	private String bookedSeats;
	
	public BookedDetails() {}

	public BookedDetails(Integer id, String email, String movieName, String showTime, Integer totalSeats, Double totalPrice, String bookedSeats)
	{
		super();
		this.id = id;
		this.email = email;
		this.movieName = movieName;
		this.showTime = showTime;
		this.totalSeats = totalSeats;
		this.totalPrice = totalPrice;
		this.bookedSeats = bookedSeats;
	}

	public Integer getId()
	{
		return id;
	}

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

	public void setId(Integer id)
	{
		this.id = id;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public void setMovieName(String movieName)
	{
		this.movieName = movieName;
	}

	public void setShowTime(String showTime)
	{
		this.showTime = showTime;
	}

	public void setTotalSeats(Integer totalSeats)
	{
		this.totalSeats = totalSeats;
	}

	public void setTotalPrice(Double totalPrice)
	{
		this.totalPrice = totalPrice;
	}

	public void setBookedSeats(String bookedSeats)
	{
		this.bookedSeats = bookedSeats;
	}

}
