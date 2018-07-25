# example-spring-boot-1.5.x-service
using Spring Boot 1.5.X to create a service in order to compare with other frameworks



A simple service with one endpoint GET /books. This is serviced by a Spring MVC controller, which passes the call to a Spring Data Mongo Repository for the list of Books.


This is to demonstrate the features of this framework.


## Spring Boot 1.5.X features

* blocking IO
* each request gets its own thread
* thread pool is a bottleneck 
* Servlet Stack: 
    - **Spring MVC** (web framework, controllers etc)
    - Servlet container (Tomcat, etc)
    - Servlet API (blocking)