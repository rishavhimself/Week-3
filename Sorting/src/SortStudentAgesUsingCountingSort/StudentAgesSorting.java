package SortStudentAgesUsingCountingSort;

public class StudentAgesSorting {
    public static void main(String[] args) {
        int[] ages = {11, 12, 11, 12, 17, 16, 15, 17, 16, 15, 18, 17, 13};
        System.out.println("Ages before sorting");
        for(int i : ages){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Ages after sorting");
        CountingSort.countingSort(ages);


    }
}
