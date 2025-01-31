package SortProductPricesUsingQuickSort;
import java.util.Arrays;

public class ProductPricesSorting {
    public static void main(String[] args) {
        double[] productPrices = {29.99, 9.99, 49.50, 15.75, 5.99, 20.00};
        System.out.println("Original Prices: " + Arrays.toString(productPrices));
        QuickSort.quickSort(productPrices, 0, productPrices.length - 1);
        System.out.println("Sorted Prices: " + Arrays.toString(productPrices));
    }
}
