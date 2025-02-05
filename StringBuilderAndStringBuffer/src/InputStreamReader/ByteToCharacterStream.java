package InputStreamReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteToCharacterStream {
    public static void main(String[] args) {
        // Specify the path to the file containing binary data encoded in UTF-8
        String filePath = "example.txt"; // Replace with your file path

        // Use try-with-resources to ensure streams are closed automatically
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             // Wrap FileInputStream with InputStreamReader and specify the charset (UTF-8)
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
             // Wrap InputStreamReader in BufferedReader for efficient reading
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            String line;
            // Read the file line by line and print each line to the console
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle any IO exceptions, including encoding issues
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
