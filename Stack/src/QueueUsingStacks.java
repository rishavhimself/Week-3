
import java.util.Stack;

// Queue implementation using two stacks
class QueueUsingStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation (push to stack1)
    public void enqueue(int value) {
        stack1.push(value);
    }

    // Dequeue operation (pop from stack2, or transfer from stack1 if empty)
    public int dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    // Peek operation (return front element without removing it)
    public int peek() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Dequeued: " + queue.dequeue()); // Output: 1
        System.out.println("Front Element: " + queue.peek()); // Output: 2
        queue.enqueue(4);
        System.out.println("Dequeued: " + queue.dequeue()); // Output: 2
    }
}



