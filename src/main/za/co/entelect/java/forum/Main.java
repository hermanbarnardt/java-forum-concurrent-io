package za.co.entelect.java.forum;

import za.co.entelect.java.forum.io.DadJokeClient;
import za.co.entelect.java.forum.io.FileUtils;

import java.io.InputStream;
import java.net.http.HttpResponse;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DadJokeClient dadJokeClient = new DadJokeClient();

        List<String> jokes = FileUtils.readAllLines("jokes.txt");
        for (String jokeId : jokes) {
            HttpResponse<InputStream> response =
                    dadJokeClient.getResponse(jokeId);
            FileUtils.saveToFile(response.body(), jokeId + ".png");
        }
    }
}