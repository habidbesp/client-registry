![Java](https://img.shields.io/badge/Java-17-orange)
![Maven](https://img.shields.io/badge/Maven-4.0.0-blue)
![Spring](https://img.shields.io/badge/Spring-Boot-green)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![PrimeFaces](https://img.shields.io/badge/PrimeFaces-5.1.2-blue)

# Fitness Zone (GYM) - web app
## Description
This project is a desktop application developed using Java Swing for the graphical user interface (GUI). It allows users to manage membership details such as first name, last name, and membership number. The backend is powered by the Spring Framework and connected to a MySQL database. The application is also built to be RESTful API-compliant, allowing for easy integration with other applications or services.

With Swing, the application provides a simple and intuitive interface for managing user data, displaying all necessary operations like adding, updating, and deleting users.

## Technologies Used
- **Spring Boot** for backend development
- **MySQL** for database management.
- **RESTful API** principles for communication between client and server

## Features
- Backend powered by the **Spring Framework**.
- **MySQL** for database management.
- Fully **RESTful** API-compliant for easy integration.
- Complete **CRUD** operations: create, read, update, and delete user data.
- User-friendly design for ease of use.

[//]: # (## Architecture Diagram)

[//]: # (The following diagram illustrates the architecture of the **Fitness Zone &#40;GYM&#41;** application:)

[//]: # ()
[//]: # (- **Presentation Layer &#40;Swing GUI&#41;**: This layer uses **Java Swing** to build the graphical user interface &#40;GUI&#41;. It handles user input and displays the results from the backend.)

[//]: # (- **Service Layer &#40;Spring Boot&#41;**: This layer contains the business logic and interacts with the **Repository** layer to handle data operations and processing.)

[//]: # (- **Repository Layer &#40;Spring Data JPA&#41;**: Manages data persistence with **Spring Data JPA**. It acts as an intermediary between the service layer and the database, handling CRUD operations.)

[//]: # (- **Entity Layer**: Represents the data model. The entities are annotated classes that map the database tables using **JPA annotations**. Examples include `@Entity`, `@Table`, `@Column`, and `@Id`.)

[//]: # (- **Database &#40;MySQL&#41;**: The relational database where user data is stored.)

[//]: # ()
[//]: # (### Architecture Diagram)

[//]: # ()
[//]: # (Below is the architecture diagram of the application:)

[//]: # ()
[//]: # (<img alt="Architecture Diagram" src="docs/images/Application%20Architecture%20Diagram.drawio.png" width="600"/>)


## Contributions
Contributions are welcome. If you find a bug or have a suggestion, please open an issue or submit a pull request.

## License
This project is licensed under the MIT License.