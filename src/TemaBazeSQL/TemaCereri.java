package TemaBazeSQL;

import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class TemaCereri {
    public static void main(String[] args) throws URISyntaxException {
        try {
            // Creaza clientul HTTP
            HttpClient client = HttpClient.newHttpClient();

            // Creaza request-ul GET
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://jsonplaceholder.typicode.com/posts"))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            //Afiseaza raspunsul
            System.out.println("Status: " + response.statusCode());
            System.out.println("Body: " + response.body());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}