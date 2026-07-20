# Use the official Nginx image from the Docker Hub
FROM nginx:alpine

# Copy the index.html file to the Nginx html directory
COPY index.html /usr/share/nginx/html/index.html

# Expose port 80
EXPOSE 80

# Start Nginx when the container starts
CMD ["nginx", "-g", "daemon off;"]
