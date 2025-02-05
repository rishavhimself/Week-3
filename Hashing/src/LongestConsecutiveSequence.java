
import java.util.HashSet;

// Longest Consecutive Sequence
class LongestConsecutiveSequence {
    // Function to find the length of the longest consecutive sequence
    public static int longestConsecutive(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (int number : numbers) {
            set.add(number);
        }
        int longestStreak = 0;
        for (int number : set) {
            if (!set.contains(number - 1)) {
                int currentNumber = number;
                int currentStreak = 1;
                while (set.contains(currentNumber + 1)) {
                    currentNumber++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }

    public static void main(String[] args) {
        int[] numbers = {100, 4, 200, 1, 3, 2};
        int result = longestConsecutive(numbers);
        System.out.println("Length of longest consecutive sequence: " + result);
    }
}

