package za.co.entelect.java.forum.io;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class FileUtils {

    /**
     * Read all the lines of the file at the given path and return the contents as a list of String
     * @param path The path of the file to be read
     * @return The contents of the file as a list of String
     */
    public static List<String> readAllLines(String path) {
        return Collections.emptyList();
    }

    /**
     * Save the given input stream to a file with the provided name
     * @param input The content of the file that should be created
     * @param fileName The name of the file that should be created
     */
    public static void saveToFile(InputStream input, String fileName) {
    }
}
