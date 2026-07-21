# Basic Python (Flask) Docker Example

This example demonstrates how to containerize a simple Python Flask application.

## How to run

1. Build the Docker image:
   ```bash
   docker build -t basic-python-app .
   ```
2. Run the Docker container:
   ```bash
   docker run -d -p 5000:5000 basic-python-app
   ```
3. Open your browser and navigate to `http://localhost:5000`.
