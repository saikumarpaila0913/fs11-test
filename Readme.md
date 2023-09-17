# Restaurant Management System

This is a simple Spring Boot application for managing restaurant information.

## Technologies Used

- **Language:** Java
- **Framework:** Spring Boot
- **Spring Modules:** Spring MVC
- **Lombok:** Used for generating getters and setters.

## Description

This application provides RESTful endpoints for performing CRUD operations on restaurant data. It uses Spring Boot for building the API and Lombok for generating getters and setters.

## API Endpoints

- `GET /restaurants/{Id}`: Get a restaurant by ID.
- `GET /restaurants/all`: Get a list of all restaurants.
- `POST /restaurants`: Add a new restaurant.
- `PUT /restaurants/{Id}`: Update restaurant information.
- `DELETE /restaurants/{Id}`: Delete a restaurant.

## Data Flow

### Controller

- `getrestById(Integer Id)`: Get a restaurant by ID.
- `getAll()`: Get a list of all restaurants.
- `Addrest(Restaurant Newrest)`: Add a new restaurant.
- `Updaterest(Integer Id, Restaurant restaurant)`: Update restaurant information.
- `remove(Integer Id)`: Delete a restaurant.

### Service

- `getrestaurantById(Integer Id)`: Get a restaurant by ID.
- `getAll()`: Get a list of all restaurants.
- `AddRest(Restaurant newrest)`: Add a new restaurant.
- `Update(Integer Id, Restaurant restaurant)`: Update restaurant information.
- `Removerest(Integer Id)`: Delete a restaurant.

### RestaurantRepo

- `getRestaurantmap()`: Get the restaurant data map.

### DataSource

- `restaurantMap()`: Create and configure a map for storing restaurant data.

## Data Structures

- `Map<Integer, Restaurant>`: Used to store restaurant data with restaurant IDs as keys.


## Project Summary

This project is a simple demonstration of a Spring Boot-based RESTful API for restaurant management. It allows you to perform basic CRUD operations on restaurant data, including adding, updating, deleting, and retrieving restaurants by ID or listing all restaurants. The project uses Java, Spring Boot, and Spring MVC for building the API and Lombok for generating getters and setters.
