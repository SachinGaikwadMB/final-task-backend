package com.mb.api.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mb.api.persistance.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>
{

}
