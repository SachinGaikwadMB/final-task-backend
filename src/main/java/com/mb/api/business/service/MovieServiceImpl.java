package com.mb.api.business.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mb.api.business.exception.CustomException;
import com.mb.api.constant.ErrorCode;
import com.mb.api.persistance.entity.Movie;
import com.mb.api.persistance.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService
{
	@Autowired
	private MovieRepository movieRepository;

	@Override
	public List<Movie> getAllMovies()
	{
		try
		{
			return movieRepository.findAll();
		}
		catch (Exception e)
		{
			throw new CustomException("Unable to fetch data !", ErrorCode.INTERNAL_SERVER_ERROR);
		}

	}

	@Override
	public Movie getMovieById(Integer id)
	{
		Optional<Movie> movieOptional = movieRepository.findById(id);
		if (movieOptional.isEmpty())
		{
			throw new CustomException("Movie not Found ", ErrorCode.NOT_FOUND);

		}

		try
		{
			return movieOptional.get();
		}
		catch (Exception e)
		{
			throw new CustomException("Unable to fetch Movie with ID ::" + id, ErrorCode.INTERNAL_SERVER_ERROR);
		}
	}

}
