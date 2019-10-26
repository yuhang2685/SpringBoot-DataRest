### SpringBoot-DataRest
In this project we show how to construct a RESTful web service using SpringBoot Data Rest and JPA

#### Author: Dr. YUHANG ZHAO

### Introduction: 
In general, Spring `Data REST` is built on top of the Spring `Data repositories` and makes it easy to build hypermedia-driven REST web services. 
It takes away a lot of the manual work usually associated with such tasks, and makes it simpler for implementing basic `CRUD` functionality for web applications.

### Overview:
- All methods are pre-build in `JpaRepository`;
- In order to make `POST` work, it needs `@GeneratedValue(strategy=GenerationType.IDENTITY)`,
  and the table must have the `primary key` "auto incremented";
- `@RepositoryRestResource(collectionResourceRel=?,path=?)` specifies the base URL to use.

### Related Projects
[SpringBoot-RESTful-MySQL-JPA](https://github.com/yuhang2685/SpringBoot-RESTful-MySQL-JPA),
which is a `RESTful` web service using `SpringBoot` and `JPA` for `MySQL`.


### System Configuration:
- Windows 7
- Java 1.8
- Spring Boot v2.1.7.RELEASE
- MySQL Connector 8.0.17


### Reference: 
"Spring Boot Tutorials | Full Course" by Telusko @ https://www.youtube.com/watch?v=35EQXmHKZYs
