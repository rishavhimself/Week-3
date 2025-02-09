package CompareDifferentDataStructuresForSearching;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class PerformanceComparison {
    public static void main(String[] args) {
        Integer [] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        long startTime=System.nanoTime();
        for(int i=0;i<array.length;i++){
            if(array[i]==10)break;
        }
        long endTime=System.nanoTime();

        System.out.println("Time taken in Array for searching : "+(endTime-startTime)+" ms\n");

        HashSet<Integer> hashSet=new HashSet(List.of(array));
        startTime=System.nanoTime();
        hashSet.contains(10);
        endTime=System.nanoTime();

        System.out.println("Time taken in HashSet for searching : "+(endTime-startTime)+" ms\n");

        TreeSet<Integer>treeSet=new TreeSet<>(List.of(array));
        startTime=System.nanoTime();
        treeSet.contains(10);
        endTime=System.nanoTime();

        System.out.println("Time taken in TreeSet for searching : "+(endTime-startTime)+" ms");

    }
}
