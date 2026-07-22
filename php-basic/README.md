# Basic PHP Docker Example

This example demonstrates how to containerize a simple PHP application running on Apache.

## How to run

1. Build the Docker image:
   ```bash
   docker build -t basic-php-app .
   ```
2. Run the Docker container:
   ```bash
   docker run -d -p 8000:80 basic-php-app
   ```
3. Open your browser and navigate to `http://localhost:8000`.
