# Spring Boot CRUD Application

This repository contains a basic CRUD (Create, Read, Update, Delete) application built with Spring Boot. It provides RESTful API endpoints for managing products.

## Setup

### Prerequisites

- Java JDK (8 or higher)
- Maven or Gradle
- Postman (optional, for testing API endpoints)
- Git (optional, for cloning the repository)

### Clone the Repository

```bash
git clone https://github.com/your-username/spring-boot-crud.git
cd spring-boot-crud
```

### Build and Run

For Maven:

```bash
mvn clean install
mvn spring-boot:run
```

For Gradle:

```bash
./gradlew build
./gradlew bootRun
```

The application will start on `http://localhost:8080`.

## API Endpoints

### Get All Products

**URL:** `/api/products`
**Method:** GET
**Response:** List of all products

### Get Product by ID

**URL:** `/api/products/{id}`
**Method:** GET
**Response:** Product with the specified ID

### Create a New Product

**URL:** `/api/products`
**Method:** POST
**Request Body:**
```json
{
    "name": "Laptop",
    "price": 1000.00
}
```
**Response:** Created product object

### Update Product

**URL:** `/api/products/{id}`
**Method:** PUT
**Request Body:**
```json
{
    "name": "Updated Laptop",
    "price": 1200.00
}
```
**Response:** Updated product object

### Delete Product

**URL:** `/api/products/{id}`
**Method:** DELETE
**Response:** No content

## Postman Collection

For detailed testing of the API endpoints, you can use the Postman collection available [here](link-to-postman-collection). Import the collection into Postman to access pre-configured requests for each endpoint.

## H2 Database Configuration

The application uses H2 Database in-memory mode for development. The configuration details can be found in `application.properties`:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

---

Feel free to customize this README file further based on your specific project details and requirements. Remember to replace placeholders like `link-to-postman-collection` with the actual links to your Postman collection or other resources.
