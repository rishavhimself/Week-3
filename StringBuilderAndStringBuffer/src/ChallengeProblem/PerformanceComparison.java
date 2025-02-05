package ChallengeProblem;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class PerformanceComparison {
    public static void main(String[] args) {
        // Compare StringBuilder and StringBuffer performance
        compareStringBuilderAndStringBuffer();

        // File path for testing (Replace with an actual 100MB file path)
        String filePath = "largeFile.txt";

        // Compare FileReader and InputStreamReader performance
        compareFileReaders(filePath);
    }

    // Method to compare StringBuilder and StringBuffer performance
    private static void compareStringBuilderAndStringBuffer() {
        int iterations = 1_000_000;
        String text = "hello";

        // Using StringBuilder
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        long endTime = System.nanoTime();
        long stringBuilderTime = TimeUnit.MILLISECONDS.convert(endTime - startTime, TimeUnit.NANOSECONDS);
        System.out.println("StringBuilder Time: " + stringBuilderTime + " ms");

        // Using StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(text);
        }
        endTime = System.nanoTime();
        long stringBufferTime = TimeUnit.MILLISECONDS.convert(endTime - startTime, TimeUnit.NANOSECONDS);
        System.out.println("StringBuffer Time: " + stringBufferTime + " ms");

        // Compare results
        if (stringBuilderTime < stringBufferTime) {
            System.out.println("StringBuilder is faster.");
        } else {
            System.out.println("StringBuffer is faster.");
        }
    }

    // Method to compare FileReader and InputStreamReader performance
    private static void compareFileReaders(String filePath) {
        System.out.println("\nReading and counting words in a large file...");

        // Using FileReader
        long startTime = System.nanoTime();
        int wordCountFileReader = countWordsUsingFileReader(filePath);
        long endTime = System.nanoTime();
        long fileReaderTime = TimeUnit.MILLISECONDS.convert(endTime - startTime, TimeUnit.NANOSECONDS);
        System.out.println("FileReader - Word Count: " + wordCountFileReader + ", Time: " + fileReaderTime + " ms");

        // Using InputStreamReader
        startTime = System.nanoTime();
        int wordCountInputStreamReader = countWordsUsingInputStreamReader(filePath);
        endTime = System.nanoTime();
        long inputStreamReaderTime = TimeUnit.MILLISECONDS.convert(endTime - startTime, TimeUnit.NANOSECONDS);
        System.out.println("InputStreamReader - Word Count: " + wordCountInputStreamReader + ", Time: " + inputStreamReaderTime + " ms");

        // Compare results
        if (fileReaderTime < inputStreamReaderTime) {
            System.out.println("FileReader is faster.");
        } else {
            System.out.println("InputStreamReader is faster.");
        }
    }

    // Method to count words using FileReader
    private static int countWordsUsingFileReader(String filePath) {
        int wordCount = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.err.println("Error reading file with FileReader: " + e.getMessage());
        }
        return wordCount;
    }

    // Method to count words using InputStreamReader
    private static int countWordsUsingInputStreamReader(String filePath) {
        int wordCount = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.err.println("Error reading file with InputStreamReader: " + e.getMessage());
        }
        return wordCount;
    }
}
