package BinarySearch;

public class SearchTargetValueIn2DArray {
    public static void main(String[] args) {
        int[][] sortedArray= {{1,2,3,4},
                              {5,6,7,8},
                              {9,10,11,12}};
        int key = 13;
        if(BinarySearch.searchTargetIn2D(sortedArray,key)){
            System.out.println("Key is present");
        }else{
            System.out.println("Key is not present");
        }
    }
}
