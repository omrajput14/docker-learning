# Use official Golang image as base
FROM golang:1.21-alpine

# Set working directory inside container
WORKDIR /app

# Copy source code
COPY main.go .

# Build the Go binary
RUN go build -o main main.go

# Expose port 8080
EXPOSE 8080

# Command to run the application
CMD ["./main"]
