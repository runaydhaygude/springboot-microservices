

### Building application
1. mvn install : to build the jar file (packaging type is jar in pom.xml)
2. above command build /target folder with jar file named using artifact and version name mentioned in pom.xml
3. java -jar target/<jar-name>.jar : run the jar file
4. run - http://localhost:8080 on browser to see if the application is live
5. java -Dserver.port=9090 -jar target/microservices-0.0.1-SNAPSHOT.jar : run same application with different instance. 
    use -Dserver.port=9090 to give different port other than 8080 (since 8080 will be used)
6. click CTRL+C on console to close the application