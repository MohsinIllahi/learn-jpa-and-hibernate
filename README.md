## Learn JPA and Hibernate with Spring Boot
A hands-on implementation repository showcasing Object-Relational Mapping (ORM), Java Persistence API (JPA), and Hibernate concepts built on top of Spring Boot. This project acts as a comprehensive reference guide for mastering database persistence in Java, heavily inspired by the practical teaching methodologies of in28minutes.
## 🚀 Key Features & Learning Pillars

* Entity Lifecycle & Relationships: Deep dive into entity states (Managed, Detached, Removed) and mapping associations including @OneToOne, @OneToMany, @ManyToOne, and @ManyToMany (Lazy vs Eager fetching).
* Data Querying Techniques: Real-world implementations of data retrieval using JPQL (Java Persistence Query Language), Criteria API (for type-safe dynamic queries), and Native SQL for performance-critical scenarios.
* Spring Data JPA & REST: Heavy reduction of boilerplate plumbing code using CrudRepository, JpaRepository, and exposing instant RESTful endpoints via Spring Data REST.
* Performance Tuning: Practical patterns for identifying and solving the classic N+1 queries problem using Entity Graphs and Join Fetches.
* Caching Architecture: Implementations of First-Level Caching (session-level) and Second-Level Caching (application-level using EhCache) to reduce database overhead.
* Inheritance Mapping: Implementations of various database structural patterns for Java inheritance like Single Table, Table per Class, and Joined strategies.

## 🛠️ Tech Stack

* Java (Version 17/21)
* Spring Boot (Starter Data JPA, Starter Web, Starter Test)
* Hibernate (JPA Provider)
* H2 Database (In-Memory database for rapid local testing and development)
* Maven (Dependency and lifecycle management)

## 📋 Prerequisites & Setup
Before running the application, make sure you have:

* JDK 17 or higher installed
* Maven 3.6+ installed
* An IDE (IntelliJ IDEA or Eclipse/STS)

## Getting Started

   1. Clone the repository:
   
   git clone https://github.com
   
   2. Navigate into the project folder:
   
   cd YOUR_REPO_NAME
   
   3. Build the project using Maven:
   
   mvn clean install
   
   4. Run the Spring Boot application:
   
   mvn spring-boot:run
   
   
## 🔍 Exploring the Data
Once the application is running, you can access the interactive in-memory database to view tables and verify data states:

* H2 Console URL: http://localhost:8080/h2-console
* JDBC URL: jdbc:h2:mem:testdb
* Username: sa
* Password: (Leave blank)



