package com.example.microservices.repo;

import com.example.microservices.domain.Tour;
import org.springframework.data.repository.CrudRepository;


public interface TourRepository extends CrudRepository<Tour, Integer> {
}
