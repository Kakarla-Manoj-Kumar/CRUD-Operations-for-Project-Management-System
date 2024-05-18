# Project Management System

## Overview
The Project Management System is a RESTful API built using Java 17 and Spring Boot. It allows users to create, read, update, and delete (CRUD) project information. The application uses an H2 in-memory database for data persistence.

## Technology Stack
- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database

## Features
- Create a new project
- Retrieve all projects
- Retrieve a project by ID
- Update an existing project
- Delete a project by ID

## Project Structure
- `controllers` - REST controllers handling HTTP requests
- `services` - Business logic layer
- `repositories` - Data access layer using Spring Data JPA
- `models` - JPA entity classes

### Prerequisites
- JDK 17 
- Maven 
- Git

### Steps to Run the Application

1. **Clone the repository**
    ```sh
    git clone https://github.com/yourusername/project-management-system.git
    cd project-management-system
    ```

2. **Build the project**
    ```sh
    mvn clean install
    ```

3. **Run the application**
    ```sh
    mvn spring-boot:run
    ```

4. **Access the application**
    - API base URL: `http://localhost:8080`
    - H2 Database Console: `http://localhost:8080/h2-console`
        - JDBC URL: `jdbc:h2:mem:Mydb`
        - Username: `sa`
        - Password: Manoj

### Configuration
- Application properties are managed in `src/main/resources/application.properties`.
    ```properties
    spring.datasource.url=jdbc:h2:mem:Mydb
    spring.datasource.driverClassName=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=Manoj
    spring.h2.console.enabled=true
    spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
    ```

## API Endpoints

### Create a Project
- **Endpoint:** `POST /projects`
- **Description:** Adds a new project.
- **Request Body:**
    ```json
    {
      "name": "Calulator",
      "description": "To Calculate",
      "startDate": "2023-05-01",
      "endDate": "2023-12-22"
    }
    ```
- **Response:**
    ```json
    {
      "name": "Calulator",
      "description": "To Calculate",
      "startDate": "2023-05-01",
      "endDate": "2023-12-22"
    }
    ```

### Retrieve All Projects
- **Endpoint:** `GET /projects`
- **Description:** Retrieves all projects.
- **Response:**
    ```json
    [
      {
        "id": 1,
      "name": "Calulator",
      "description": "To Calculate",
      "startDate": "2023-05-01",
      "endDate": "2023-12-22"
      }
    ]
    ```

### Retrieve a Project by ID
- **Endpoint:** `GET /projects/{id}`
- **Description:** Retrieves a project by its ID.
- **Response:**
    ```json
   {
      "name": "Calulator",
      "description": "To Calculate",
      "startDate": "2023-05-01",
      "endDate": "2023-12-22"
    }
    ```

### Update a Project
- **Endpoint:** `PUT /projects/{id}`
- **Description:** Updates an existing project.
- **Request Body:**
    ```json
    {
      "name": "Calulator 2.0",
      "description": "To Calculate",
      "startDate": "2023-07-01",
      "endDate": "2024-04-22"
    }
    ```
- **Response:**
    ```json
   {
      "name": "Calulator 2.0",
      "description": "To Calculate",
      "startDate": "2023-07-01",
      "endDate": "2024-04-22"
    }
    ```

### Delete a Project
- **Endpoint:** `DELETE /projects/{id}`
- **Description:** Deletes a project by its ID.
- **Response:** `204 No Content`




## License
This project is licensed under the MIT License.

## Author
- Manoj

## Contributing
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -m 'Add some feature'`).
5. Push to the branch (`git push origin feature-branch`).

## Acknowledgments
- Spring Boot documentation
- H2 Database documentation
