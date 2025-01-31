package SortExamScoresUsingSelectionSort;

public class SelectionSort {
    public static void selectionSort(int [] array){
        for(int i=0;i<array.length-1;i++) {
            int minPosition = i;
            for(int j=i+1;j< array.length-1;j++){
                if(array[minPosition]>array[j]){
                    minPosition=j;
                }
            }
//          array[minPosition]=array[minPosition]^array[i];
//          array[i]=array[minPosition]^array[i];
//          array[minPosition]=array[minPosition]^array[i];
            int temp= array[minPosition];
            array[minPosition]=array[i];
            array[i]=temp;
        }

    }
}
