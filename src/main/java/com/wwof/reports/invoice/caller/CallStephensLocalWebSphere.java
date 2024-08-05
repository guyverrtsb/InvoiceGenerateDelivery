package com.wwof.reports.invoice.caller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CallStephensLocalWebSphere {
    public void call() {
        String url = "https://20.254.0.2:9080/mojo/servlet/com.vfc.mojo.mvc.servlet.ControllerFacadeServlet"; // Replace with your URL

        System.out.println("Url: " + url);
        // Create an HttpClient

        HttpClient client = HttpClient.newHttpClient();

        // Create a GET request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        // Send the request and handle the response
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Print the response status code
            System.out.println("Response Code: " + response.statusCode());

            // Print the response body
            System.out.println("Response Body: " + response.body());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
