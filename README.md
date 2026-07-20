# Docker Learning

This is a basic repository to start learning Docker. It contains a simple HTML file served by an Nginx web server.

## How to run

1. Build the Docker image:
   ```bash
   docker build -t basic-docker-app .
   ```
2. Run the Docker container:
   ```bash
   docker run -d -p 8080:80 basic-docker-app
   ```
3. Open your browser and navigate to `http://localhost:8080`.
