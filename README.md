# Streams Microservices Project

A **Java-based project** demonstrating microservices architecture with Spring Boot, Kafka streaming, Docker, Avro serialization, Gradle, and Jenkins CI/CD. This project showcases efficient real-time data processing and modern software engineering practices.

## Project Structure
<pre>
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
</pre>


## Business Logic and Functionalities

The Streams Microservices Project is designed to handle real-time data processing for various business operations. The core functionalities include:

- **Calculator Service**: Provides mathematical operations and real-time calculations as a microservice.
- **Order Service**: Manages order creation, updates, and status tracking, ensuring data consistency across the system.
- **Inventory Service**: Keeps track of inventory levels, updates stock information, and handles inventory adjustments.

## Running the Project

### Prerequisites
- Docker
- Docker Compose

### Steps
1. Clone the repository:
    ```bash
    git clone https://github.com/renatosviana/streams-microservices-project.git
    cd streams-microservices-project
    ```

2. Build the services:
    ```bash
    ./gradlew build
    ```

3. Start the services using Docker Compose:
    ```bash
    docker-compose up -d
    ```

## Postman Collection

A Postman collection is provided to facilitate API testing. The collection is located in the `doc` folder (https://github.com/renatosviana/streams-microservices-project/tree/master/calculator-service/doc):
- **StreamCrafter.postman_collection.json**: Includes pre-configured API requests for testing the microservices.

## Technologies Used
- **Java**
- **Spring Boot**
- **Kafka**
- **Docker**
- **Avro**
- **Gradle**
- **Jenkins CI/CD**

## Features
- **Spring Boot:** Framework for building Java applications.
- **Microservices:** Modular and independently deployable services.
- **Kafka Streaming:** For real-time data streaming and processing.
- **Docker:** Containerization of services for easy deployment.
- **Avro Serialization:** Efficient data serialization format.
- **Gradle:** Build automation tool.
- **Jenkins CI/CD:** Continuous Integration and Continuous Deployment pipeline. (TBD)

## Contribution
Feel free to contribute by submitting pull requests or opening issues for any improvements.

