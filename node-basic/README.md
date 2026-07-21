# Basic Node.js Docker Example

This example demonstrates how to containerize a simple Node.js Express application.

## How to run

1. Build the Docker image:
   ```bash
   docker build -t basic-node-app .
   ```
2. Run the Docker container:
   ```bash
   docker run -d -p 3000:3000 basic-node-app
   ```
3. Open your browser and navigate to `http://localhost:3000`.
