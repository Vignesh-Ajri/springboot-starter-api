# Student Management REST API

A simple Spring Boot REST API for managing students.

## Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- H2 In-Memory Database
- Maven

## Project Structure

```
com.example.studentapi
│
├── controller
├── service
├── repository
├── model
└── exception
```

## How to Run

### 1. Clone the repository

```
git clone <repo-url>
```

### 2. Navigate into project

```
cd student-management-api
```

### 3. Run the application

```
mvn spring-boot:run
```

OR run `StudentApiApplication.java` from your IDE.

## API Endpoints

### Create Student

POST `/api/students`

Example Body:

```json
{
  "name": "John",
  "email": "john@example.com",
  "age": 21
}
```

### Get All Students

```
GET `/api/students`
```

### Get Student By ID

```
GET `/api/students/{id}`
```

### Delete Student

```
DELETE `/api/students/{id}`
```

## Features

- RESTful API design
- Layered architecture (Controller → Service → Repository)
- Input validation
- Global exception handling
- H2 in-memory database integration

## H2 Database Console

After running the app, open:

```
http://localhost:8080/h2-console
```

JDBC URL:

```
jdbc:h2:mem:studentdb
```

Username:

```
sa
```

Password:

```
(empty)
```

---

Backend Practice Project for learning Spring Boot.
