# Multi-Stage Build Docker Example

This example demonstrates how to use Docker Multi-Stage Builds to produce minimal container image sizes by separating the build environment from the runtime environment.

## How to run

1. Build the Docker image:
   ```bash
   docker build -t multi-stage-app .
   ```
2. Run the Docker container:
   ```bash
   docker run -d -p 8080:8080 multi-stage-app
   ```
3. Open your browser and navigate to `http://localhost:8080`.
