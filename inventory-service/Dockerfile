# Dockerfile for Inventory-Service
FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=build/libs/inventory-service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
