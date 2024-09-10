package patterns.creational.Builder.Client;

import patterns.creational.Builder.Representations.HttpRequest;

public class Client {

        public static void main(String[] args) {
            // Creating a GET request
            HttpRequest getRequest = new HttpRequest.Builder("GET", "https://api.example.com/data")
                    .addQueryParam("userId", "12345")
                    .addHeader("Authorization", "Bearer token_xyz")
                    .build();

            // Creating a POST request
            HttpRequest postRequest = new HttpRequest.Builder("POST", "https://api.example.com/update")
                    .addHeader("Authorization", "Bearer token_xyz")
                    .setBody("{ \"name\": \"John\" }")
                    .setTimeout(10000)  // Custom timeout
                    .build();

            // Output the requests
            System.out.println("GET Request: " + getRequest);
            System.out.println("POST Request: " + postRequest);
    }
}
