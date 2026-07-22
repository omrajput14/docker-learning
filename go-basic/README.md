# Basic Go Docker Example

This example demonstrates how to containerize a simple Go HTTP web server.

## How to run

1. Build the Docker image:
   ```bash
   docker build -t basic-go-app .
   ```
2. Run the Docker container:
   ```bash
   docker run -d -p 8080:8080 basic-go-app
   ```
3. Open your browser and navigate to `http://localhost:8080`.
