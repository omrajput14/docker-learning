package com.example;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.sql.Connection;
import java.sql.DriverManager;

public class App {
    public static void main(String[] args) throws IOException {
        int port = 8080;
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        
        server.createContext("/", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                String dbHost = System.getenv().getOrDefault("DB_HOST", "db");
                String dbPort = System.getenv().getOrDefault("DB_PORT", "5432");
                String dbName = System.getenv().getOrDefault("DB_NAME", "testdb");
                String dbUser = System.getenv().getOrDefault("DB_USER", "postgres");
                String dbPass = System.getenv().getOrDefault("DB_PASSWORD", "postgres");

                String jdbcUrl = "jdbc:postgresql://" + dbHost + ":" + dbPort + "/" + dbName;
                
                String dbStatus;
                boolean connected = false;
                try {
                    Class.forName("org.postgresql.Driver");
                    try (Connection conn = DriverManager.getConnection(jdbcUrl, dbUser, dbPass)) {
                        connected = true;
                        dbStatus = "<p style='color: green;'><strong>Successfully connected to PostgreSQL database!</strong></p>";
                    }
                } catch (Exception e) {
                    dbStatus = "<p style='color: red;'><strong>Database Connection Error:</strong> " + e.getMessage() + "</p>";
                }

                String response = "<html><body>" +
                                  "<h1>Java Docker Compose Demo</h1>" +
                                  "<p>Connecting to database URL: <code>" + jdbcUrl + "</code></p>" +
                                  dbStatus +
                                  "</body></html>";

                exchange.getResponseHeaders().set("Content-Type", "text/html; charset=UTF-8");
                exchange.sendResponseHeaders(connected ? 200 : 500, response.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        });

        server.setExecutor(null);
        System.out.println("Java Docker Compose App running on port " + port);
        server.start();
    }
}
