# Java Maven Docker Setup

This directory demonstrates how to package and run a Maven-managed Java application inside a Docker container.

## How to run

1. Build the Docker image:
   ```bash
   docker build -t java-maven-app .
   ```

2. Run the Docker container:
   ```bash
   docker run -d -p 8080:8080 --name java-maven-container java-maven-app
   ```

3. Open your browser and navigate to `http://localhost:8080`.
