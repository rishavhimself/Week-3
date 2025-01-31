package SortEmployeeIDsUsingInsertionSort;

public class InsertionSort {
    public static void insertionSort(int [] array){
        for(int i=1;i<array.length;i++){
            int current = array[i];
            int previous = i-1;
            while(previous>=0&&array[previous]>current){
                array[previous+1]=array[previous];
                previous--;
            }
            array[previous+1]=current;
        }
    }
}
