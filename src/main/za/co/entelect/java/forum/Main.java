package za.co.entelect.java.forum;

import za.co.entelect.java.forum.concurrency.ThreadPoolExecutorBuilder;
import za.co.entelect.java.forum.io.DadJokeClient;
import za.co.entelect.java.forum.io.FileUtils;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {

        DadJokeClient dadJokeClient = new DadJokeClient();

        var executorService = ThreadPoolExecutorBuilder.buildThreadPoolExecutor();
        var jokes = CompletableFuture.supplyAsync(() -> FileUtils.readAllLines("jokes.txt"), executorService);
        jokes.join().forEach(jokeId -> {
            executorService.submit(() -> {
                System.out.println("Running on Thread : " + Thread.currentThread());
                var httpResponse = dadJokeClient.getResponse(jokeId);
                FileUtils.saveToFile(httpResponse.body(), jokeId + ".png");
            });
        });
    }
}