# # Use an official Java runtime as a parent image
# FROM openjdk:11
#
# # Set the working directory in the container
# WORKDIR /app
#
# # Copy the jar file into the container
# COPY ./build/libs/GenAI.jar /app
#
# # Make port 8080 available to the world outside this container
# EXPOSE 8080
#
# # Run the jar file
# CMD ["java", "-jar", "GenAI.jar"]
# Dockerfile
# Dockerfile for Calculator-Service
FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=build/libs/calculator-service.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

