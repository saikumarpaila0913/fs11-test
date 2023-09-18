# URL Hit Counter - Spring Boot Application

This is a simple Spring Boot application for counting URL hits and providing hit counts for specific usernames.

## Technologies Used

- **Language:** Java
- **Framework:** Spring Boot
- **Spring Modules:** Spring Web
- **Lombok:** Used for generating getters and setters.

## Data Flow

### Controller

- `GET /api/v1/visitor-count-app/count`: Get the total hit count for all visitors.
- `GET /api/v1/visitor-count-app/username/{username}/count`: Get the hit count for a specific username.

### Service

- `getHitCount()`: Get the total hit count.
- `getUserHitCount(username)`: Get the hit count for a specific username.

### Data Structures

- `Map<String, Integer>`: Used to store hit counts for different usernames.

## Project Summary

This project demonstrates a Spring Boot-based URL hit counter application. It provides two endpoints: one to retrieve the total hit count and another to retrieve hit counts for specific usernames. The application uses Java and Spring Boot to handle incoming requests and Lombok for code simplification. Hit counts are stored in a map data structure, and the application offers a straightforward way to retrieve and display hit counts.
