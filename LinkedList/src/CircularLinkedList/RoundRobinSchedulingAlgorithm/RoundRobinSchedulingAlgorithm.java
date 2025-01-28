package CircularLinkedList.RoundRobinSchedulingAlgorithm;

public class RoundRobinSchedulingAlgorithm {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        // Adding processes to the scheduler
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 15, 2);
        scheduler.addProcess(3, 20, 1);

        // Displaying all processes
        scheduler.displayProcesses();

        // Simulate round-robin scheduling with a time quantum of 5
        scheduler.simulateRoundRobin(5);
    }
}
