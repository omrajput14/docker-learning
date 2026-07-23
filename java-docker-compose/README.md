# Java Docker Compose with PostgreSQL Setup

This directory demonstrates orchestrating a Java HTTP web service and a PostgreSQL database container using Docker Compose.

## Architecture

- **`app`**: Java Web Server packaged with PostgreSQL JDBC driver.
- **`db`**: PostgreSQL 16 database instance with automatic health check.

## How to run

1. Start services with Docker Compose:
   ```bash
   docker compose up --build
   ```

2. Open your browser and navigate to `http://localhost:8080`.

3. To stop all services:
   ```bash
   docker compose down
   ```
