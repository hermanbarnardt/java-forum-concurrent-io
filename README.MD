# Java Forum Concurrency and IO API Practical

This repository contains the framework for an application to download dad jokes as images.

Your task is to complete the functions below:
1. Read the joke identifiers from the provided text file `jokes.txt`
2. Create a `HTTPRequest` to retrieve a specified joke
3. Send the request and return the image as an `InputStream`
4. Update the application to concurrently download the jokes