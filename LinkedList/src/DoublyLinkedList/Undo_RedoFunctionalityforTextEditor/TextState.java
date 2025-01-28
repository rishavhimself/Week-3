package DoublyLinkedList.Undo_RedoFunctionalityforTextEditor;

public class TextState {
    String content;
    TextState next;
    TextState prev;

    // Constructor to initialize a text state
    public TextState(String content) {
        this.content = content;
        this.next = null;
        this.prev = null;
    }
}