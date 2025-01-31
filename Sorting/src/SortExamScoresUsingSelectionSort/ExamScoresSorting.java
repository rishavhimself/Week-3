package SortExamScoresUsingSelectionSort;

public class ExamScoresSorting {
    public static void main(String[] args) {
        int [] scores = {70,86,54,40,99,76};
        System.out.println("Exam scores before sorting ");
        for(int score : scores){
            System.out.print(score+" ");
        }
        System.out.println();

        SelectionSort.selectionSort(scores);
        System.out.println("Exam scores after sorting");
        for(int score : scores){
            System.out.print(score+" ");
        }
        System.out.println();
    }
}
