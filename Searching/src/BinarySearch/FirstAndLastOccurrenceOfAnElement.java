package BinarySearch;

public class FirstAndLastOccurrenceOfAnElement {
    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,2,2,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,7,7,7,8,8,9,9,9,9};
        int element=4;
        int first=BinarySearch.findFirstOccurrence(numbers,element);
        int last=BinarySearch.findLastOccurrence(numbers,element);
        System.out.println("First Occurrence of the given element is : "+first+" while the last occurrence is : "+last);
    }
}
