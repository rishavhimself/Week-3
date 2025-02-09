package SearchTargetInLargeDataset;

import java.util.*;

public class PerformanceComparison {

    public static void main(String[] args) {
        int [] numbers=new int[1000];
        numbers[999]=10;

        int [] newNumbers=new int[10000];
        newNumbers[9999]=10;

        int [] finalNumbers=new int[100000];
        finalNumbers[50000]=10;

        LinearSearch linearSearch=new LinearSearch();

        long startTime = System.nanoTime();
        int index = LinearSearch.linearSearch(numbers,10);
        long endTime = System.nanoTime();
        System.out.println("The time taken by Linear search for 1000 elements is :"+(endTime-startTime)+" ms");

        startTime = System.nanoTime();
        index = LinearSearch.linearSearch(newNumbers,10);
        endTime = System.nanoTime();
        System.out.println("The time taken by Linear search for 10000 elements is :"+(endTime-startTime)+" ms");

        startTime = System.nanoTime();
        index = LinearSearch.linearSearch(finalNumbers,10);
        endTime = System.nanoTime();
        System.out.println("The time taken by Linear search for 100000 elements is :"+(endTime-startTime)+" ms\n");

        BinarySearch binarySearch = new BinarySearch();

        Arrays.sort(numbers);
        startTime = System.nanoTime();
        index = BinarySearch.binarySearch(numbers,10);
        endTime = System.nanoTime();
        System.out.println("The time taken by Binary search for 1000 elements is :"+(endTime-startTime)+" ms");

        Arrays.sort(numbers);
        startTime = System.nanoTime();
        index = BinarySearch.binarySearch(newNumbers,10);
        endTime = System.nanoTime();
        System.out.println("The time taken by Binary search for 10000 elements is :"+(endTime-startTime)+" ms");

        Arrays.sort(numbers);
        startTime = System.nanoTime();
        index = BinarySearch.binarySearch(finalNumbers,10);
        endTime = System.nanoTime();
        System.out.println("The time taken by Binary search for 100000 elements is :"+(endTime-startTime)+" ms");
    }
}
