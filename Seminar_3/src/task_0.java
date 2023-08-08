import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Перепишите код, воспользовавшись механизмом try-with-resources
 */
public class task_0 {

    public static void main(String[] args) {
        try {
            rwLine(Path.of("Seminar_3\\src\\1.txt"), Path.of("Seminar_3\\src\\2.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void rwLine(Path pathRead, Path pathWrite) throws IOException {
        try (BufferedReader in = Files.newBufferedReader(pathRead);
             BufferedWriter out = Files.newBufferedWriter(pathWrite)) {
            out.write(in.readLine());
        }
    }
}