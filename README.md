

### Building application
1. mvn install : to build the jar file (packaging type is jar in pom.xml)
2. above command build /target folder with jar file named using artifact and version name mentioned in pom.xml
3. java -jar target/<jar-name>.jar : run the jar file
4. run - http://localhost:8080 on browser to see if the application is live
5. java -Dserver.port=9090 -jar target/microservices-0.0.1-SNAPSHOT.jar : run same application with different instance. 
    use -Dserver.port=9090 to give different port other than 8080 (since 8080 will be used)
6. click CTRL+C on console to close the application


### Spring Data JPA
1. spring provides with CrudRepository<T, ID> interface for the basic CRUD operations on table
2. T represents the entity type that you want to perform CRUD operations on.
3. ID represents the data type of the primary key of the entity.
4. We extend TourRepository to CrudRepository
5. use @Query annotation to method for complex queries in interface file
6. JPQL (Java Persistence Query Language) is a platform-independent query language used in Java applications to
   interact with relational databases using the Java Persistence API (JPA). JPQL allows developers to express database
   queries in an object-oriented and database-independent way, similar to SQL (Structured Query Language), but tailored
   to work with JPA-managed entities and their relationships.

### CommandLineRunner interface
It is an interface that allows you to execute code when a Spring Boot application starts.
It's particularly useful for performing tasks such as data initialization, setup, or any custom logic that needs to run
when your application is launched.


### H2 database
1. JPA performs db queries on H2 repo.
2. we spawn H2 by mentioning its dependency on pom.xml
3. if we explicitly don't mention db details in application.properties
    then default config is used by JPA

### Rest Repository
Spring Data REST is a part of the Spring Data project that simplifies the creation of RESTful APIs for your data models.
It builds on top of Spring Data repositories and automatically exposes them as RESTful web services with minimal
additional code. Spring Data REST provides a quick way to create CRUD (Create, Read, Update, Delete) endpoints for your
data models without having to write explicit controller code.
1. http://localhost:8080/tourPackages/BC : out-of-the-box GET api for TourPackage Entity (annotated with @Entity)
2. POST http://localhost:8080/tourPackages 


### Spring Data MongoDB
Spring Data MongoDB is a Spring-based framework that simplifies interaction with MongoDB NoSQL databases.
MongoDB is a NoSQL database that stores data in a flexible, document-oriented format, and is known for
its scalability and ease of use.
Use MongoDB when you need a flexible, schema-less NoSQL database that excels at handling unstructured or semi-structured
data, high write loads, and horizontal scalability.
1. Clas is annotated with @Document instead of @Entity
2. @Indexed - to increase search performance
3. @DBRef - refers to another Document within a Document






