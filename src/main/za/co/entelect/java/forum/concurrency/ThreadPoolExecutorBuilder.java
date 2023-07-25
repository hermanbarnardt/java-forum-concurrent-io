package za.co.entelect.java.forum.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorBuilder {

    private static final int corePoolSize = 10;
    private static final int maxPoolSize = 12;
    private static final int idleTime = 2;

    public static ExecutorService buildThreadPoolExecutor() {
        return new ThreadPoolExecutor(corePoolSize, maxPoolSize, idleTime, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
    }
}
