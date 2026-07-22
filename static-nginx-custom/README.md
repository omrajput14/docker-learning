# Custom Nginx Config Docker Example

This example demonstrates how to supply a custom `nginx.conf` configuration file in a Dockerized Nginx application.

## How to run

1. Build the Docker image:
   ```bash
   docker build -t custom-nginx-app .
   ```
2. Run the Docker container:
   ```bash
   docker run -d -p 8081:80 custom-nginx-app
   ```
3. Open your browser and navigate to `http://localhost:8081`.
