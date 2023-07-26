package za.co.entelect.java.forum;

import za.co.entelect.java.forum.concurrency.ThreadPoolExecutorBuilder;
import za.co.entelect.java.forum.io.DadJokeClient;
import za.co.entelect.java.forum.io.FileUtils;

import java.io.InputStream;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public class Main {
    public static void main(String[] args) {

        DadJokeClient dadJokeClient = new DadJokeClient();

        ExecutorService executorService = ThreadPoolExecutorBuilder.buildThreadPoolExecutor();
        CompletableFuture<List<String>> jokes = CompletableFuture.supplyAsync(() -> FileUtils.readAllLines("jokes.txt"), executorService);
        jokes.join().forEach(jokeId -> {
            executorService.submit(() -> {
                System.out.println("Running on Thread : " + Thread.currentThread());
                HttpResponse<InputStream> httpResponse = dadJokeClient.getResponse(jokeId);
                FileUtils.saveToFile(httpResponse.body(), jokeId + ".png");
            });
        });
    }
}