package DoublyLinkedList.Undo_RedoFunctionalityforTextEditor;

public class UndoRedoSystem {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10); // Limit history to 10 states

        // Simulating editor actions
        editor.addState("State 1: Hello");
        editor.addState("State 2: Hello World");
        editor.addState("State 3: Hello World!");

        // Display current state
        editor.displayCurrentState();

        // Perform undo operations
        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        // Perform redo operations
        editor.redo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        // Add a new state after undo
        editor.undo();
        editor.addState("State 4: Hello Universe");
        editor.displayCurrentState();

        // Display all states
        editor.displayAllStates();
    }
}

