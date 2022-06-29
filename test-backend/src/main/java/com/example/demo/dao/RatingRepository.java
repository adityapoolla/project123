package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Rating;

public interface RatingRepository extends JpaRepository<Rating, Long>{

}
