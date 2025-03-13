package TemaBazeSQL;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class TemaCereriTrimitere {
    public static void main(String[] args) {
        try {
            // Creează clientul HTTP
            HttpClient client = HttpClient.newHttpClient();

            // Creează datele în format JSON
            String json = """
            {
                "title": "Postare din Java",
                "body": "Acesta este corpul postării.",
                "userId": 1
            }
            """;

            // Creează request-ul POST
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://jsonplaceholder.typicode.com/posts"))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(json))
                    .build();

            // Trimite request-ul și primește răspunsul
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Afișează răspunsul
            System.out.println("Status: " + response.statusCode());
            System.out.println("Body: " + response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}