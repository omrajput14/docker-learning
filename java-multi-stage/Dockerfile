# Stage 1: Build stage with Maven and JDK
FROM maven:3.9-eclipse-temurin-21-alpine AS builder

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

# Stage 2: Runtime stage with minimal JRE
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

# Copy the packaged JAR from the builder stage
COPY --from=builder /app/target/app.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
