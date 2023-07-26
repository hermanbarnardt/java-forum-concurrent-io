package za.co.entelect.java.forum;

import za.co.entelect.java.forum.concurrency.ThreadPoolExecutorBuilder;
import za.co.entelect.java.forum.io.DadJokeClient;
import za.co.entelect.java.forum.io.FileUtils;

public class Main {
    public static void main(String[] args) {

        DadJokeClient dadJokeClient = new DadJokeClient();

        var executorService = ThreadPoolExecutorBuilder.buildThreadPoolExecutor();
        var jokes = FileUtils.readAllLines("jokes.txt");
        jokes.forEach((jokeId -> {
            System.out.println("Running on Thread : " + Thread.currentThread());
            var httpResponse = dadJokeClient.getResponse(jokeId);
            FileUtils.saveToFile(httpResponse.body(), jokeId + ".png");
        }));
    }
}