package LargeFileReadingEfficiency;

import java.io.*;

public class LargeFileReaderComparison {
    public static void main(String[] args) {
        String filePath = "large_file.txt"; // Change this to your actual file path

        System.out.println("Reading file using FileReader...");
        long fileReaderTime = measureFileReaderTime(filePath);
        System.out.println("Time taken by FileReader: " + fileReaderTime + " ms\n");

        System.out.println("Reading file using InputStreamReader...");
        long inputStreamReaderTime = measureInputStreamReaderTime(filePath);
        System.out.println("Time taken by InputStreamReader: " + inputStreamReaderTime + " ms\n");
    }

    private static long measureFileReaderTime(String filePath) {
        long startTime = System.currentTimeMillis();
        try (FileReader fileReader = new FileReader(filePath)) {
            while (fileReader.read() != -1) {
                // Reading character by character (inefficient for large files)
            }
        } catch (IOException e) {
            System.out.println("Error reading file with FileReader: " + e.getMessage());
        }
        return System.currentTimeMillis() - startTime;
    }

    private static long measureInputStreamReaderTime(String filePath) {
        long startTime = System.currentTimeMillis();
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath))) {
            while (inputStreamReader.read() != -1) {
                // Reading character by character
            }
        } catch (IOException e) {
            System.out.println("Error reading file with InputStreamReader: " + e.getMessage());
        }
        return System.currentTimeMillis() - startTime;
    }
}
