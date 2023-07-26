package za.co.entelect.java.forum;

import za.co.entelect.java.forum.concurrency.ThreadPoolExecutorBuilder;
import za.co.entelect.java.forum.io.DadJokeClient;
import za.co.entelect.java.forum.io.FileUtils;

import java.io.InputStream;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class Main {
    public static void main(String[] args) {

        DadJokeClient dadJokeClient = new DadJokeClient();

        ExecutorService executorService = ThreadPoolExecutorBuilder.buildThreadPoolExecutor();
        List<String> jokes = FileUtils.readAllLines("jokes.txt");
        jokes.forEach((jokeId -> {
            System.out.println("Running on Thread : " + Thread.currentThread());
            HttpResponse<InputStream> httpResponse = dadJokeClient.getResponse(jokeId);
            FileUtils.saveToFile(httpResponse.body(), jokeId + ".png");
        }));
    }
}