package CircularLinkedList.TaskScheduler;

public class TaskManagement {
    public static void main(String[] args) {
        TaskScheduler taskScheduler = new TaskScheduler();

        // Adding tasks
        taskScheduler.addTaskAtBeginning(1, "Task A", 1, "2025-01-30");
        taskScheduler.addTaskAtEnd(2, "Task B", 2, "2025-02-15");
        taskScheduler.addTaskAtPosition(2, 3, "Task C", 3, "2025-02-10");

        // Display all tasks
        taskScheduler.displayAllTasks();

        // View and move to the next task
        taskScheduler.viewAndMoveToNextTask();
        taskScheduler.viewAndMoveToNextTask();

        // Search for a task by priority
        taskScheduler.searchTaskByPriority(2);

        // Remove a task
        taskScheduler.removeTaskById(2);

        // Display all tasks after removal
        taskScheduler.displayAllTasks();
    }
}
