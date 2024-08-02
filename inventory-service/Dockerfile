# Dockerfile for Inventory-Service
FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=build/libs/inventory-service.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
