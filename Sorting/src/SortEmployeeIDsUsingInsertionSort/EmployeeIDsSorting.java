package SortEmployeeIDsUsingInsertionSort;

public class EmployeeIDsSorting {
    public static void main(String[] args) {
        int [] employeeIDs = {123,124,125,126,121,120,119,115};
        System.out.println("Employee IDs before Sorting");
        for(int ids : employeeIDs){
            System.out.print(ids+" ");
        }
        System.out.println();

        InsertionSort.insertionSort(employeeIDs);

        System.out.println("Employee IDs after sorting");
        for(int ids : employeeIDs){
            System.out.print(ids+" ");
        }
        System.out.println();
    }
}
