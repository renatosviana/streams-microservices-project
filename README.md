# Streams Microservices Project

A **Java-based project** demonstrating microservices architecture with Spring Boot, Kafka streaming, Docker, Avro serialization, Gradle, and Jenkins CI/CD. This project showcases efficient real-time data processing and modern software engineering practices.

## Project Structure

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



## Prerequisites

- Docker
- Docker Compose

## Running the Project

### Steps

1. **Clone the repository:**
   ```bash
   git clone https://github.com/renatosviana/streams-microservices-project.git
   cd streams-microservices-project

2. **Build the services:**
   ```bash
   ./gradlew build

4. **Start the services using Docker Compose:**
   ```bash
   docker-compose up -d

## Postman Collection
A Postman collection for testing the microservices is included in the project:
- File: StreamCrafter.postman_collection.json


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

