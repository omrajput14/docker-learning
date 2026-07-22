package main

import (
	"fmt"
	"net/http"
)

func main() {
	http.HandleFunc("/", func(w http.ResponseWriter, r *http.Request) {
		fmt.Fprintf(w, "Hello from Multi-Stage Docker Build!")
	})
	fmt.Println("Multi-stage server listening on port 8080...")
	http.ListenAndServe(":8080", nil)
}
