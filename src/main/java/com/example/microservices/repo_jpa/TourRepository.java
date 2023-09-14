package com.example.microservices.repo_jpa;

import com.example.microservices.domain_jpa.Tour;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TourRepository extends CrudRepository<Tour, Integer> {
}
