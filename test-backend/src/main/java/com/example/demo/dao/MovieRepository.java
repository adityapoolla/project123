package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

	List<Movie> findByTitleContaining(String title);

}
