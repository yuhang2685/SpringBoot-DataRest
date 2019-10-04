## DemoSpringBootDataRest
Author: Dr. YUHANG ZHAO

### Introduction: 
In this demo we will explain the basics of Spring Data REST and show how to use it to build a simple REST API.

### Overview:
In general, Spring Data REST is built on top of the Spring Data repositories and makes it easy to build hypermedia-driven REST web services. It takes away a lot of the manual work usually associated with such tasks, and makes it simpler for implementing basic `CRUD` functionality for web applications.
- All methods are pre-build in `JpaRepository`;
- In order to make POST work, it needs `@GeneratedValue(strategy=GenerationType.IDENTITY)`,
  and table must have the primary key which is auto increment;
- `@RepositoryRestResource(collectionResourceRel=?,path=?)` specifies the base URL to use.

### System Configuration:
- Windows 7
- Java 1.8
- Spring Tool Suite 3.9.9.RELEASE
- Spring Boot v2.1.7.RELEASE
- MySQL Workbench v8.0
- MySQL Connector 8.0.17
- POSTMAN
- JPA

### Reference: 
"Spring Boot Tutorials | Full Course" https://www.youtube.com/watch?v=35EQXmHKZYs
