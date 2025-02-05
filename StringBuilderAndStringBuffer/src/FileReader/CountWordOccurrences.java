package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordOccurrences {
    public static void main(String[] args) {
        // Specify the path to the file and the target word to search for
        String filePath = "Example.txt"; // Replace with your file path
        String targetWord = "yourWord";    // Replace with the word you want to count
        int count = 0;                     // Counter for the target word occurrences

        // Use try-with-resources to ensure the file is closed automatically
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read the file line by line
            while ((line = bufferedReader.readLine()) != null) {
                // Split the line into words based on whitespace
                String[] words = line.split("\\s+");
                // Check each word in the current line
                for (String word : words) {
                    // Compare the word to the target word (case-sensitive)
                    if (word.equals(targetWord)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        // Print the final count of the target word
        System.out.println("The word '" + targetWord + "' occurred " + count + " times.");
    }
}
