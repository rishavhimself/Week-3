package BinarySearch;

public class FindTheRotationPoint {
    public static void main(String[] args) {
        int[]rotatedArray={7,8,9,1,2,3,4,5,6};
        int rotationPoint= BinarySearch.findRotationPoint(rotatedArray);
        System.out.println("Rotation point is : "+rotationPoint);
    }
}
