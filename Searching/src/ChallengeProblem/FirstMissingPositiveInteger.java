package ChallengeProblem;

import java.util.Arrays;

public class FirstMissingPositiveInteger {
    public static void main(String[] args) {
        int [] array={6,7,8,2,10,3,11,12,4,13,1,5,14};
        Arrays.sort(array);
        System.out.println("First positive missing integer is "+firstMissingPositiveInteger(array));
        int target=5;
        System.out.println("The index of given integer is "+binarySearch(array,target));

    }

    public static int firstMissingPositiveInteger(int []array){
        int max = Integer.MIN_VALUE;
        for (int j : array) max = Math.max(max, j);
        for(int i=0;i<max;i++){
            if(array[i]!=i+1){
                return i+1;
            }
        }
        return array.length+1;
    }

    public static int binarySearch(int []array,int target){
        int start=0,end=array.length-1;
        while(start<=end){
            int mid= (start+end)/2;
            if(array[mid]==target)return mid;
            else if (array[mid]>target)end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
}
