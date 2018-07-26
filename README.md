# example-spring-boot-1.5.x-service
using Spring Boot 1.5.X to create a service in order to compare with other frameworks



## The example service
A simple service with one endpoint GET /books. This is serviced by a Spring MVC controller, which passes the call to a Spring Data Mongo Repository for the list of Books. 


`>curl -X GET http://localhost:8080/books`


## Spring Boot 1.5.X features

* blocking IO
* each request gets its own thread
    - the size of the thread pool can be a bottleneck
    - database connection pool can be a bottleneck
    - IO to external providers will block
* Servlet Stack: 
    - **Spring MVC** (web framework, controllers etc)
    - Servlet container (Tomcat, etc)
    - Servlet API (blocking)
    
    