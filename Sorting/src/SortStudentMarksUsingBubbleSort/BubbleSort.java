package SortStudentMarksUsingBubbleSort;

public class BubbleSort {
    public static void bubbleSort(int [] array){
        for(int i=0;i<array.length-1;i++){
            boolean flag=true;
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    array[j]=array[j]^array[j+1];
                    array[j+1]=array[j]^array[j+1];
                    array[j]=array[j]^array[j+1];
                    flag=false;
                }
            }
            if(flag)break;
        }

    }
}
