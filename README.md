# example-spring-boot-1.5.x-service
using Spring Boot 1.5.X to create a service in order to compare with other frameworks

A simple service with one endpoint GET /books. 

`curl -X GET http://localhost:8080/books`

**Stack:**
- Spring Boot 1.5.X
- Spring MVC
- Reactive Spring Data - Mongo
- Embedded MongoDB 
- Lombok

![per_thread_handling.png](per_thread_handling.png)
_fig.1 thread per request_


## Spring Boot 1.5.X features

* one thread-per-request execution model
    - synchronous and blocking IO
    - the size of the servlet thread pool can be a bottleneck
    - database connection pool size need to be coordinated with servlet thread pool
* Servlet Stack: 
    - Spring MVC (web framework, controllers etc, uses Tomcat by default)
    - Servlet container (Tomcat, etc)
    - Servlet API (blocking)