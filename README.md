# Spring REST API for Employee Management

This Spring REST API project provides endpoints for managing employee records within an organization. It includes features such as adding, searching, updating, and removing employee data. Additionally, it offers functionality for creating admin accounts, logging in, and logging out.

## Endpoints

- **Add Employee:** `/add` (POST)
- **Search Employee:** `/search/{id}` (GET)
- **Remove Employee:** `/remove/{id}` (GET)
- **Update Employee:** `/update/{id}/{name}/{email}/{contact}/{designation}/{salary}` (POST)
- **Create Admin Account:** `/createadmin` (POST)
- **Login:** `/login/{username}/{password}` (POST)
- **Logout:** `/logout` (GET)

## Technologies Used

- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate ORM
- MySQL database
- JSON for data exchange

## Getting Started

1. Clone this repository.
2. Configure MySQL database connection in `application.properties`.
3. Build and run the application.
4. Access endpoints using cURL, Postman, or any REST client.

## Dependencies

- Java Development Kit (JDK)
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate ORM
- MySQL JDBC driver

