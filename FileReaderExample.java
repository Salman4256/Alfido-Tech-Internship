import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {
        String filePath = "sample.txt";

        try {
            readFile(filePath);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    private static void readFile(String filePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("File Contents:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
