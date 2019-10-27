### SpringBoot-DataRest
In this project we show how to construct a RESTful web service using SpringBoot Data Rest and JPA

#### Author: Dr. YUHANG ZHAO

#### Introduction: 
In general, Spring `Data REST` is built on top of the Spring `Data repositories` 
and makes it easy to build `hypermedia-driven` REST web services that connect to `Spring Data` repositories. 
`Spring Data` project provides common abstractions to integrate with different kinds of data stores, 
both `SQL-based` and `No SQL`-based.
It takes away a lot of the manual work usually associated with such tasks, 
and makes it simpler for implementing basic `CRUD` functionality for web applications.
More detailed, it analyzes your application’s domain model, 
and exposes hypermedia-driven `HTTP` resources for aggregates contained in the model.
At runtime, Spring Data REST automatically creates an implementation of the repository interface. 
Then it uses the `@RepositoryRestResource` annotation to direct `Spring MVC` to create `RESTful` endpoints.


#### When to use Spring Data Rest?
Remember to use Spring Data Rest only for simple projects. 
It is great to use when you are building a prototype for your application. 
However, when it comes to production applications, you need to think twice before using Spring Data Rest.


#### Overview of key points:
- Dependency for `JPA` and 'data-rest' are both needed;
- The `@RepositoryRestResource` annotation is optional and is used to customize the REST endpoint. If we decided to omit it, Spring would automatically create an endpoint using the lower case of class name, i.e., “/alien”, instead of the user costomized one.
- In order to make `POST` work, it needs `@GeneratedValue(strategy=GenerationType.IDENTITY)`,
  and the table must have the `primary key` "auto incremented";
- `@RepositoryRestResource(collectionResourceRel=?,path=?)` specifies the base URL to use.


#### Testing REST API
Once you have the `Entity` and `RepositoryRestResource`, 
you now have a fully-functional REST API,
and you are ready to fire your requests.
- you can send a POST request to a URL to create a resource;
- you can go to the URL and see what resources are currently stored there; 
- You can also access a specific item stored in the repository; 
- You can do a search on the repository by typing in a query;
- You can also do a search by directly invoking the repository method

#### That's it! Cheers!


#### Related Projects
[SpringBoot-RESTful-MySQL-JPA](https://github.com/yuhang2685/SpringBoot-RESTful-MySQL-JPA),
which is a `RESTful` web service using `SpringBoot` and `JPA` for `MySQL`.


#### System Configuration:
- Windows 7
- Java 1.8
- Spring Boot v2.1.7.RELEASE
- MySQL Connector 8.0.17


#### Reference: 
- "Spring Boot Tutorials | Full Course" by Telusko @ https://www.youtube.com/watch?v=35EQXmHKZYs
- "Introduction To Spring Data Rest - Quick Tutorial for Beginners" by "In28MINUTES" @ https://www.springboottutorial.com/spring-boot-introduction-to-spring-data-rest
