package CircularLinkedList.TaskScheduler;

public class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next; // Pointer to the next node

    // Constructor to initialize a task node
    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}