package SortingLargeDataEfficiently;

public class PerformanceComparison {
    public static void main(String[] args) {
        double[] numbers = new double[1000];
        double[] newNumbers = new double[10000];
        double[] finalNumbers = new double[100000];
        //Filling arrays with sample values
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random() * 100;  // Assigning random values
        }
        for (int i = 0; i < newNumbers.length; i++) {
            newNumbers[i] = Math.random() * 100;
        }
        for (int i = 0; i < finalNumbers.length; i++) {
            finalNumbers[i] = Math.random() * 100;
        }

        BubbleSort bubbleSort = new BubbleSort();

        long startTime = System.nanoTime();
        BubbleSort.bubbleSort(finalNumbers);
        long endTime =System.nanoTime();
        System.out.println("Time taken by Bubble sort to sort 100000 elements : "+(endTime-startTime)+" ms");

        startTime = System.nanoTime();
        BubbleSort.bubbleSort(newNumbers);
        endTime =System.nanoTime();
        System.out.println("Time taken by Bubble sort to sort 10000 elements : "+(endTime-startTime)+" ms");

        startTime = System.nanoTime();
        BubbleSort.bubbleSort(numbers);
        endTime =System.nanoTime();
        System.out.println("Time taken by Bubble sort to sort 1000 elements : "+(endTime-startTime)+" ms\n");

        QuickSort quickSort = new QuickSort();

        startTime = System.nanoTime();
        QuickSort.quickSort(finalNumbers,0,finalNumbers.length-1);
        endTime =System.nanoTime();
        System.out.println("Time taken by Quick sort to sort 100000 elements : "+(endTime-startTime)+" ms");

        startTime = System.nanoTime();
        QuickSort.quickSort(newNumbers,0,newNumbers.length-1);
        endTime =System.nanoTime();
        System.out.println("Time taken by Quick sort to sort 10000 elements : "+(endTime-startTime)+" ms");

        startTime = System.nanoTime();
        QuickSort.quickSort(numbers,0,numbers.length-1);
        endTime =System.nanoTime();
        System.out.println("Time taken by Quick sort to sort 1000 elements : "+(endTime-startTime)+" ms\n");

        MergeSort mergeSort = new MergeSort();

        startTime = System.nanoTime();
        MergeSort.mergeSort(finalNumbers,0,finalNumbers.length-1);
        endTime =System.nanoTime();
        System.out.println("Time taken by merge sort to sort 100000 elements : "+(endTime-startTime)+" ms");

        startTime = System.nanoTime();
        MergeSort.mergeSort(newNumbers,0,newNumbers.length-1);
        endTime =System.nanoTime();
        System.out.println("Time taken by merge sort to sort 10000 elements : "+(endTime-startTime)+" ms");

        startTime = System.nanoTime();
        MergeSort.mergeSort(numbers,0,numbers.length-1);
        endTime =System.nanoTime();
        System.out.println("Time taken by merge sort to sort 1000 elements : "+(endTime-startTime)+" ms");

    }
}
