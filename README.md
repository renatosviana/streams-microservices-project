# Streams Microservices Project

A **Java-based project** demonstrating microservices architecture with Spring Boot, Kafka streaming, Docker, Avro serialization, Gradle, and Jenkins CI/CD. This project showcases efficient real-time data processing and modern software engineering practices.

## Project Structure

streams-microservices-project
├── calculator-service
│   ├── src/main/java/com/calculator
│   ├── build.gradle
│   ├── Dockerfile
├── order-service
│   ├── src/main/java/com/order
│   ├── build.gradle
│   ├── Dockerfile
├── inventory-service
│   ├── src/main/java/com/inventory
│   ├── build.gradle
│   ├── Dockerfile
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

##Postman Collection
A Postman collection for testing the microservices is included in the project:

