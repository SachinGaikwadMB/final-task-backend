package com.mb.api.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.mb.api.business.service.MovieService;
import com.mb.api.persistance.entity.Movie;
import static com.mb.api.constant.UrlMapping.MOVIES;
import static com.mb.api.constant.UrlMapping.SINGLE_MOVIE;

@RestController
@CrossOrigin("http://localhost:4200/")
public class MovieController extends BaseController
{
	@Autowired
	private MovieService movieService;
	
	@GetMapping(MOVIES)
	public ResponseEntity<List<Movie>> getAllMovies() {
		List<Movie> responseBody = movieService.getAllMovies();
		return new ResponseEntity<>(responseBody, HttpStatus.OK);
	}
	
	@GetMapping(SINGLE_MOVIE)
	public ResponseEntity<Movie> getMovieById(@PathVariable Integer id) {
		return new ResponseEntity<>(movieService.getMovieById(id), HttpStatus.OK);
	}
}
