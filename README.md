# example-spring-boot-1.5.x-service
using Spring Boot 1.5.X to create a service in order to compare with other frameworks

A simple service with one endpoint GET /books. 

`curl -X GET http://localhost:8080/books`

### stack
- Spring Boot 1.5.X
- Spring MVC
- Reactive Spring Data - Mongo
- Embedded MongoDB 
- Lombok

![per_thread_handling.png](per_thread_handling.png)

## Spring Boot 1.5.X features

* one thread-per-request execution model
    - synchronous and blocking
    - the size of the thread pool can be a bottleneck
    - database connection pool can be a bottleneck
    - IO to external providers will block
* Servlet Stack: 
    - **Spring MVC** (web framework, controllers etc, uses Tomcat by default)
    - Servlet container (Tomcat, etc)
    - Servlet API (blocking)
    