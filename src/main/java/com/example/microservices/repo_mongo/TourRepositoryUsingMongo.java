/*
package com.example.microservices.repo_mongo;

import com.example.microservices.domain_mongo.TourForMongo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;


public interface TourRepositoryUsingMongo extends PagingAndSortingRepository<TourForMongo, String> {
    */
/**
     * Find Tours associated with the Tour Package.
     *
     * @param code tour package code
     * @return List of found tours.
     *//*

    Page<TourForMongo> findByTourPackageCode(@Param("code")String code, Pageable pageable);

    */
/**
     * Only return the main fields of a Tour, not the details
     *
     * @param code tour package code
     * @return tours without details
     *//*

    @Query(value = "{'tourPackageCode' : ?0 }",
            fields = "{ 'id':1, 'title':1, 'tourPackageCode':1, 'tourPackageName':1}")
    Page<TourForMongo> findSummaryByTourPackageCode(@Param("code")String code, Pageable pageable);

    @Override
    @RestResource(exported = false)
    <S extends TourForMongo> S save(S s);

    @Override
    @RestResource(exported = false)
    <S extends TourForMongo> Iterable<S> saveAll(Iterable<S> iterable);

    @Override
    @RestResource(exported = false)
    void deleteById(String string);

    @Override
    @RestResource(exported = false)
    void delete(TourForMongo tourForMongo);

    @Override
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends TourForMongo> iterable);

    @Override
    @RestResource(exported = false)
    void deleteAll();
}
*/
