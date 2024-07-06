## Streams Microservices Project
This repository contains a microservices-based project implemented in Java using Spring Boot. The project demonstrates a basic microservice architecture with three services: Order Service, Inventory Service, and Calculator Service. Each service is designed to handle specific business logic and communicate with each other via Apache Kafka.

## Services
1. Order Service
The Order Service is responsible for handling order-related operations. It listens to order events and processes them accordingly.

2. Inventory Service
The Inventory Service manages inventory levels. It listens to order events and updates the inventory based on the order details.

3. Calculator Service
The Calculator Service performs basic arithmetic operations. It acts independently of the Order and Inventory services.

## Technologies Used
Java 17
Spring Boot
Spring Data JPA
Apache Kafka
H2 Database
Docker
Docker Compose
Running the Project
Prerequisites
Docker
Docker Compose
Steps
Clone the repository:

## Running the Project
### Prerequisites
- Docker
- Docker Compose

### Steps

1. Clone the repository:
    ```sh
    git clone https://github.com/renatosviana/streams-microservices-project.git
    cd streams-microservices-project
    ```

2. Build the services:
    ```sh
    ./gradlew build
    ```

3. Start the services using Docker Compose:
    ```sh
    docker-compose up -d
    ```

## Accessing Services
Order Service: http://localhost:8081
Inventory Service: http://localhost:8082
Calculator Service: http://localhost:8083

## API Documentation
API documentation for each service can be found in the doc directory of the respective service. Additionally, a Postman collection is provided for testing the APIs.

### Postman Collection
To test the microservices, you can use the provided Postman collection. Import the `StreamCrafter.postman_collection.json` file from the `doc` directory into Postman.

## Project Structure
streams-microservices-project
streams-microservices-project
├── calculator-service
│ ├── src/main/java/com/calculator
│ ├── build.gradle
│ ├── Dockerfile
├── order-service
│ ├── src/main/java/com/order
│ ├── build.gradle
│ ├── Dockerfile
├── inventory-service
│ ├── src/main/java/com/inventory
│ ├── build.gradle
│ ├── Dockerfile
├── docker-compose.yml
└── README.md

Contact
For any questions or suggestions, please open an issue or contact the repository owner.

