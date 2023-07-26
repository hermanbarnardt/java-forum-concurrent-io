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

    /**
     * Get the response from the HttpClient for a given joke ID
     * @param jokeId The id of the joke to be retrieved
     * @return HttpResponse containing an InputStream body
     */
    public HttpResponse<InputStream> getResponse(String jokeId)  {
        return null;
    }

    /***
     * Create a HttpRequest that will call the endpoint for the provided joke ID
     * @param jokeId The ID of the joke that will be retrieved
     * @return The HttpRequest that will call the endpoint
     */
    public HttpRequest createRequest(String jokeId) {
        return null;
    }

    /***
     * Creates a URI that points to the endpoint to download a specified joke as an image
     * @param jokeId The ID of the joke to be downloaded
     * @return The URI of the endpoint that points to the image of the joke
     */
    private URI creatURI(String jokeId) {
        return URI.create("https://icanhazdadjoke.com/j/" + jokeId + ".png");
    }

}
