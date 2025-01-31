package SortanArrayofBookPricesUsingMergeSort;

import java.util.Arrays;

public class BooksSorting {
    public static void main(String[] args) {
        double[] bookPrices = {19.99, 5.99, 25.50, 10.75, 3.99, 15.00};
        System.out.println("Original Prices: " + Arrays.toString(bookPrices));
        MergeSort.mergeSort(bookPrices, 0, bookPrices.length - 1);
        System.out.println("Sorted Prices: " + Arrays.toString(bookPrices));
    }
}
