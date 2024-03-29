package com.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.model.MovieEntity;
@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Long> {

}
