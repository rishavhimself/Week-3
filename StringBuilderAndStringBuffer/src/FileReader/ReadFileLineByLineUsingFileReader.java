package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class  ReadFileLineByLineUsingFileReader{
    public static void main(String[] args) {
        // Specify the path to the file you want to read
        String filePath = "Example.txt";

        // Create a FileReader and wrap it in a BufferedReader
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read the file line by line until there are no more lines
            while ((line = bufferedReader.readLine()) != null) {
                // Print each line to the console
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

