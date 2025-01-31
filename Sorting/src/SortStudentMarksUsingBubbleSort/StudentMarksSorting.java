package SortStudentMarksUsingBubbleSort;

public class StudentMarksSorting {
    public static void main(String[] args) {
        int [] marks= {50,75,98,60,88};
        System.out.println("Marks before sorting");
        for(int number : marks){
            System.out.print(number+" ");
        }
        System.out.println();
        System.out.println("Sorted Student Marks");
        BubbleSort.bubbleSort(marks);
        for(int number : marks){
            System.out.print(number+" ");
        }
        System.out.println();
    }
}
