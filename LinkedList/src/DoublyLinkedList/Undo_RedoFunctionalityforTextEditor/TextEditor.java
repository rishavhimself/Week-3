package DoublyLinkedList.Undo_RedoFunctionalityforTextEditor;

public class TextEditor {
    private TextState head;
    private TextState tail;
    private TextState current;
    private int size;
    private final int MAX_HISTORY;

    // Constructor to initialize the editor with a maximum history size
    public TextEditor(int maxHistory) {
        this.head = null;
        this.tail = null;
        this.current = null;
        this.size = 0;
        this.MAX_HISTORY = maxHistory;
    }

    // Method to add a new state
    public void addState(String content) {
        TextState newState = new TextState(content);

        // If the list is empty
        if (head == null) {
            head = tail = current = newState;
        } else {
            // Remove forward history if any
            if (current != tail) {
                current.next = null;
                tail = current;
            }

            // Add new state at the end
            tail.next = newState;
            newState.prev = tail;
            tail = newState;
            current = newState;
        }

        size++;

        // Remove the oldest state if history exceeds the limit
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Method to undo to the previous state
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("No more undo operations available.");
        }
    }

    // Method to redo to the next state
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("No more redo operations available.");
        }
    }

    // Method to display the current state
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current State: " + current.content);
        } else {
            System.out.println("No states available.");
        }
    }

    // Method to display all states (for debugging)
    public void displayAllStates() {
        TextState temp = head;
        System.out.println("All States:");
        while (temp != null) {
            System.out.println(temp.content);
            temp = temp.next;
        }
    }
}
