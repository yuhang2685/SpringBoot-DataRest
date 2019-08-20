# DemoSpringBootDataRest
This demo is parallel to DemoSpringBootRestJPA using Spring Boot Data Rest instead of Controllors

Author: Dr. YUHANG ZHAO

Introduction: 
In this demo we supply a quick-start code base with explanation for constructing a REST service with Spring Boot Data Rest.

Overview:
In this demo we covered the use of some new stuffs, 
i.e., 
- Spring Boot Data Rest does the same thing as CONTROLLOR;
- All methods are pre-build in the interface "JpaRepository";
- In order to make POST work, it needs @GeneratedValue(strategy=GenerationType.IDENTITY),
  and table must have the primary key which is auto increment;
- @RepositoryRestResource(collectionResourceRel=?,path=?) specifies the base URL to use.

Future Work: 

System Configuration:
- Windows 7
- Spring Tool Suite 3.9.9.RELEASE
- Spring Boot v2.1.7.RELEASE
- MySQL Workbench v8.0
- MySQL Connector 8.0.17
- POSTMAN
- JPA

Reference: 
- "Spring Boot Tutorials | Full Course" https://www.youtube.com/watch?v=35EQXmHKZYs
