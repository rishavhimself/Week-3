package CircularLinkedList.TaskScheduler;

class TaskScheduler {
    private Task head; // Head of the circular linked list
    private Task tail; // Tail of the circular linked list
    private Task currentTask; // Pointer to the current task for iteration

    // Method to add a task at the beginning
    public void addTaskAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            newTask.next = head; // Circular reference
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head; // Maintain circular nature
        }
    }

    // Method to add a task at the end
    public void addTaskAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            newTask.next = head; // Circular reference
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head; // Maintain circular nature
        }
    }

    // Method to add a task at a specific position
    public void addTaskAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }

        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (position == 1) {
            addTaskAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }

        Task current = head;
        for (int i = 1; i < position - 1 && current.next != head; i++) {
            current = current.next;
        }

        if (current.next == head) {
            addTaskAtEnd(taskId, taskName, priority, dueDate);
        } else {
            newTask.next = current.next;
            current.next = newTask;
        }
    }

    // Method to remove a task by Task ID
    public void removeTaskById(int taskId) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        Task current = head;
        Task previous = tail;

        do {
            if (current.taskId == taskId) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = previous;
                    tail.next = head;
                } else {
                    previous.next = current.next;
                }
                System.out.println("Task with ID " + taskId + " removed.");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Task with ID " + taskId + " not found.");
    }

    // Method to view the current task and move to the next task
    public void viewAndMoveToNextTask() {
        if (currentTask == null) {
            currentTask = head;
        }

        if (currentTask != null) {
            System.out.println("Current Task: ID: " + currentTask.taskId + ", Name: " + currentTask.taskName + ", Priority: " + currentTask.priority + ", Due Date: " + currentTask.dueDate);
            currentTask = currentTask.next;
        } else {
            System.out.println("No tasks available.");
        }
    }

    // Method to display all tasks starting from the head node
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("Task List:");
        Task current = head;
        do {
            System.out.println("ID: " + current.taskId + ", Name: " + current.taskName + ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
            current = current.next;
        } while (current != head);
    }

    // Method to search for tasks by priority
    public void searchTaskByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        boolean found = false;
        Task current = head;
        do {
            if (current.priority == priority) {
                System.out.println("Task Found: ID: " + current.taskId + ", Name: " + current.taskName + ", Due Date: " + current.dueDate);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No tasks found with priority " + priority);
        }
    }
}
