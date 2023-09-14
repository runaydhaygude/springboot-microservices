/*
package com.example.microservices.domain_mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;
import java.util.Objects;


@Document
public class TourForMongo {
    @Id
    private String id;

    @Indexed
    private String title;

    @Indexed
    private String tourPackageCode;

    private String tourPackageName;

    private Map<String, String> details;

    */
/**
     * Construct a fully initialized Tour.
     *
     * @param title title of the tour
     * @param tourPackageForMongo tour package
     * @param details details about the tour (key-value pairs)
     *//*

    public TourForMongo(String title, TourPackageForMongo tourPackageForMongo, Map<String, String> details) {
        this.title = title;
        this.tourPackageCode = tourPackageForMongo.getCode();
        this.tourPackageName = tourPackageForMongo.getName();
        this.details = details;
    }

    protected TourForMongo() {
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getTourPackageCode() {
        return tourPackageCode;
    }

    public String getTourPackageName() {
        return tourPackageName;
    }

    public Map<String, String> getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "id='" + id + '\'' +
                ", details=" + details +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TourForMongo tourForMongo = (TourForMongo) o;
        return Objects.equals(id, tourForMongo.id) &&
                Objects.equals(details, tourForMongo.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, details);
    }

}
*/
