package za.co.entelect.java.forum.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorBuilder {

    private static final int corePoolSize = 10;
    private static final int maxPoolSize = 12;
    private static final int idleTime = 2;

    /**
     * Create a custom thread pool executor
     * @return Executor Service managing the thread pool
     */
    public static ExecutorService buildThreadPoolExecutor() {
        return null;
    }
}
