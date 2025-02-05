import java.util.HashSet;

// Check for a Pair with Given Sum in an Array
class PairWithGivenSum {
    // Function to check if a pair with the given sum exists
    public static boolean hasPairWithSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(target - num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 10};
        int target = 14;
        boolean result = hasPairWithSum(arr, target);
        System.out.println("Pair with given sum exists: " + result);
    }
}
