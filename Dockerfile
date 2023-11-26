# Build stage
FROM maven:3.8.4-openjdk-17-slim AS build
WORKDIR /home/app
COPY src src
COPY pom.xml .
RUN mvn clean package

# Package stage
FROM openjdk:17.0.1-jdk-slim
WORKDIR /usr/local/lib
COPY --from=build /home/app/target/*.jar app.jar

# Set default port as an environment variable
ENV PORT 8090

# Expose the port (this is for documentation purposes)
EXPOSE $PORT

ENTRYPOINT ["java", "-jar", "app.jar"]
