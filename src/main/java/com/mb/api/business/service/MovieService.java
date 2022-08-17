package com.mb.api.business.service;

import java.util.List;
import com.mb.api.persistance.entity.Movie;

public interface MovieService
{
	List<Movie> getAllMovies();
	
	Movie getMovieById(Integer id);
}
