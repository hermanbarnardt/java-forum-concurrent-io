package za.co.entelect.java.forum.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DadJokeClient {

    final HttpClient client;

    public DadJokeClient() {
        client = HttpClient.newHttpClient();
    }

    public HttpResponse<InputStream> getResponse(String jokeId) throws IOException, InterruptedException {
        return client.send(createRequest(jokeId), HttpResponse.BodyHandlers.ofInputStream());
    }

    public HttpRequest createRequest(String jokeId) {
        return HttpRequest.newBuilder(creatURI(jokeId)).GET().build();
    }

    private URI creatURI(String jokeId) {
        return URI.create("https://icanhazdadjoke.com/j/" + jokeId + ".png");
    }

}
