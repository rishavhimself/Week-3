package InputStreamReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputToFile {
    public static void main(String[] args) {
        // Specify the file where the input will be written
        String filePath = "output.txt";

        // Use try-with-resources to ensure both the reader and writer are closed automatically
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filePath))) {

            System.out.println("Enter text (type 'exit' to finish):");
            String inputLine;

            // Read user input line by line
            while ((inputLine = consoleReader.readLine()) != null) {
                // If the user enters "exit", stop reading further input
                if ("exit".equalsIgnoreCase(inputLine.trim())) {
                    break;
                }
                // Write the input line to the file and add a new line
                fileWriter.write(inputLine);
                fileWriter.newLine();
            }

            System.out.println("Your input has been written to " + filePath);
        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}
