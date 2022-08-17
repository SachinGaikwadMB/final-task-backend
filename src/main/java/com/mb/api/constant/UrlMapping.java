package com.mb.api.constant;

public class UrlMapping
{

	private UrlMapping()
	{
		throw new IllegalStateException("Constants class.can't instatiate");
	}

	public static final String BASE_URL = "api/v1";
	public static final String USER = "/user";
	public static final String MOVIES = "/movies";
	public static final String SINGLE_MOVIE = "/movies/{id}";
	public static final String BOOKING_DETAILS = "/booking-details";
}
