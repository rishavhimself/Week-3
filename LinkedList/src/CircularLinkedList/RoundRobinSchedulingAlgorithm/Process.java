package CircularLinkedList.RoundRobinSchedulingAlgorithm;

public class Process {
    int processId;
    int burstTime;
    int priority;
    Process next;

    // Constructor to initialize a process node
    public Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
