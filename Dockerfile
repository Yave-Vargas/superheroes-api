# Stage 1: Build the application
FROM eclipse-temurin:23-jdk 
# Copy the JAR file from the builder stage
COPY target/superheroes-0.0.1-SNAPSHOT.jar app.jar
# Command to run the application
ENTRYPOINT ["java","-jar","/app.jar"]