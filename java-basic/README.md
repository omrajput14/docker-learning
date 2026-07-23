# Basic Java Docker Setup

This directory demonstrates how to containerize a standalone Java application using `eclipse-temurin:21-jdk-alpine`.

## How to run

1. Build the Docker image:
   ```bash
   docker build -t java-basic-app .
   ```

2. Run the Docker container:
   ```bash
   docker run -d -p 8080:8080 --name java-basic-container java-basic-app
   ```

3. Open your browser and navigate to `http://localhost:8080`.
