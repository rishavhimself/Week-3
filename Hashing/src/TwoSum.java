
import java.util.HashMap;

public class TwoSum {

    public static int[] findTwoSumIndices(int[] nums, int target) {
        // Create a HashMap
        HashMap<Integer, Integer> numberIndices = new HashMap<>();

        // Iterate through the array
        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            int currentNumber = nums[currentIndex];
            int complement = target - currentNumber;

            if (numberIndices.containsKey(complement)) {
                return new int[] { numberIndices.get(complement), currentIndex };
            }

            numberIndices.put(currentNumber, currentIndex);
        }

        // Return an empty array if no solution is found
        return new int[] {};
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Find the indices of the two numbers that add up to the target
        int[] result = findTwoSumIndices(nums, target);

        // Print the result (indices of the two numbers)
        if (result.length > 0) {
            System.out.println("Indices of numbers that add up to " + target + ": " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found");
        }
    }
}




