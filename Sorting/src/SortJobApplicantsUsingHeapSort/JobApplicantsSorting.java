package SortJobApplicantsbySalaryUsingHeapSort;

import java.util.Arrays;
public class JobApplicantsSorting {
    public static void main(String[] args) {
        double[] salaries = {55000, 42000, 70000, 36000, 48000, 62000};
        System.out.println("Original Salaries: " + Arrays.toString(salaries));
        HeapSort.heapSort(salaries);
        System.out.println("Sorted Salaries: " + Arrays.toString(salaries));
    }
}
