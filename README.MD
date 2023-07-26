# Java Forum Concurrency and IO API Practical

This repository contains the framework for an application to download dad jokes as images.

Your task is to implement the functions below:
1. [readAllLines()](./src/main/za/co/entelect/java/forum/io/FileUtils.java) Read the joke identifiers from the provided text file `jokes.txt`
2. [saveToFile()](./src/main/za/co/entelect/java/forum/io/FileUtils.java) Save an `InputStream` to a `.png` image
3. [createRequest()](./src/main/za/co/entelect/java/forum/io/DadJokeClient.java) Create a `HttpRequest` to retrieve a specified joke
4. [getResponse()](./src/main/za/co/entelect/java/forum/io/DadJokeClient.java) Send the request and return the image as an `InputStream`
5. [buildThreadPoolExecutor()](./src/main/za/co/entelect/java/forum/concurrency/ThreadPoolExecutorBuilder.java) Create and return a thread pool executor
    > Hint: use this constructor 
    > ``` 
    > public ThreadPoolExecutor(int corePoolSize,  
    >   int maximumPoolSize,  
    >   long keepAliveTime,  
    >   TimeUnit unit,  
    >   BlockingQueue<Runnable> workQueue)
      
6. [main()](./src/main/za/co/entelect/java/forum/Main.java) Update the application to concurrently download the jokes. 
    >Hint: Each joke can be fetched and saved on a separate thread
