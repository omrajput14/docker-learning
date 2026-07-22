# Stage 1: Build the Go application
FROM golang:1.21-alpine AS builder

WORKDIR /app

COPY main.go .

# Build a lightweight static binary
RUN CGO_ENABLED=0 GOOS=linux go build -a -installsuffix cgo -o main main.go

# Stage 2: Final minimal runtime image
FROM alpine:latest  

WORKDIR /root/

# Copy binary from Stage 1
COPY --from=builder /app/main .

EXPOSE 8080

CMD ["./main"]
