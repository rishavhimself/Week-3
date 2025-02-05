import java.util.Stack;
public class SortStackRecursive{
        // Function to sort the stack
        public static void sortStack(Stack<Integer> stack) {
            if (!stack.isEmpty()) {
                int temp = stack.pop(); // Remove top element
                sortStack(stack); // Recursively sort remaining stack
                insertSorted(stack, temp); // Insert the popped element back in sorted order
            }
        }

        // Helper function to insert an element in a sorted stack
        private static void insertSorted(Stack<Integer> stack, int value) {
            if (stack.isEmpty() || stack.peek() <= value) {
                stack.push(value);
            } else {
                int temp = stack.pop(); // Remove top element
                insertSorted(stack, value); // Recursively insert
                stack.push(temp); // Push the removed element back
            }
        }

        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();
            stack.push(30);
            stack.push(10);
            stack.push(50);
            stack.push(20);
            stack.push(40);

            System.out.println("Original Stack: " + stack);
            sortStack(stack);
            System.out.println("Sorted Stack: " + stack);
        }
    }
