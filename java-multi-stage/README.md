# Java Multi-Stage Docker Build

This directory demonstrates how to use a multi-stage Docker build for Java applications.

## Why Multi-Stage Build?

- **Build Stage**: Uses `maven:3.9-eclipse-temurin-21-alpine` to compile source code and package the `.jar`.
- **Runtime Stage**: Uses `eclipse-temurin:21-jre-alpine` containing only the Java Runtime Environment (JRE). Maven and build tools are discarded, drastically reducing the final Docker image size and security attack surface.

## How to run

1. Build the Docker image:
   ```bash
   docker build -t java-multi-stage-app .
   ```

2. Run the Docker container:
   ```bash
   docker run -d -p 8080:8080 --name java-multi-stage-container java-multi-stage-app
   ```

3. Open your browser and navigate to `http://localhost:8080`.
