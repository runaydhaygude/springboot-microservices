package com.example.microservices.repo;

import com.example.microservices.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;


public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
}

