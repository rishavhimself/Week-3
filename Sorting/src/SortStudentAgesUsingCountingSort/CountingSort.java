package SortStudentAgesUsingCountingSort;

public class CountingSort {
    public static void countingSort(int [] array){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            max=Math.max(array[i],max );
        }
        int [] counting=new int[max];

        for (int i : array) {
            counting[i-1]+=1;
        }
        for(int i=0;i< counting.length;i++){
            while(counting[i]>0){
                System.out.print(i+1+" ");
                counting[i]--;
            }
        }
        System.out.println();
    }
}
