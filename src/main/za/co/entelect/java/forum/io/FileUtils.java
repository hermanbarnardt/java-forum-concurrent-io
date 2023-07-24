package za.co.entelect.java.forum.io;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileUtils {

    public static List<String> readAllLines(String path) {
        Path file = Path.of(path);
        try {
            return Files.readAllLines(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void saveToFile(InputStream input, String fileName) {
        Path file = Path.of(fileName);
        try {
            Files.copy(input, file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
