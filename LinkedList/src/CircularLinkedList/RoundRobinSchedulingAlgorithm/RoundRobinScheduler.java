package CircularLinkedList.RoundRobinSchedulingAlgorithm;

public class RoundRobinScheduler {
        private Process head;
        private Process tail;

        // Method to add a process at the end of the circular list
        public void addProcess(int processId, int burstTime, int priority) {
            Process newProcess = new Process(processId, burstTime, priority);
            if (head == null) {
                head = tail = newProcess;
                tail.next = head; // Making it circular
            } else {
                tail.next = newProcess;
                tail = newProcess;
                tail.next = head;
            }
        }

        // Method to remove a process by Process ID
        public void removeProcess(int processId) {
            if (head == null) {
                System.out.println("No processes available.");
                return;
            }

            Process current = head;
            Process previous = null;
            do {
                if (current.processId == processId) {
                    if (current == head && current == tail) { // Single process in the list
                        head = tail = null;
                    } else if (current == head) { // Removing the head process
                        head = head.next;
                        tail.next = head;
                    } else if (current == tail) { // Removing the tail process
                        tail = previous;
                        tail.next = head;
                    } else { // Removing a process in the middle
                        previous.next = current.next;
                    }
                    System.out.println("Process " + processId + " removed.");
                    return;
                }
                previous = current;
                current = current.next;
            } while (current != head);

            System.out.println("Process with ID " + processId + " not found.");
        }

        // Method to simulate round-robin scheduling
        public void simulateRoundRobin(int timeQuantum) {
            if (head == null) {
                System.out.println("No processes to schedule.");
                return;
            }

            Process current = head;
            int totalWaitingTime = 0;
            int totalTurnaroundTime = 0;
            int processCount = 0;

            System.out.println("Starting Round-Robin Scheduling...");

            while (head != null) {
                System.out.println("Executing Process ID: " + current.processId);
                if (current.burstTime > timeQuantum) {
                    current.burstTime -= timeQuantum;
                    System.out.println("Process ID: " + current.processId + " has remaining burst time: " + current.burstTime);
                    current = current.next;
                } else {
                    totalTurnaroundTime += current.burstTime;
                    totalWaitingTime += totalTurnaroundTime - current.burstTime;
                    int completedProcessId = current.processId;
                    removeProcess(current.processId);
                    if (head == null) break;
                    current = current.next;
                    System.out.println("Process ID: " + completedProcessId + " has completed execution.");
                }

                processCount++;
            }

            System.out.println("Scheduling Completed.");
            System.out.println("Average Waiting Time: " + (double) totalWaitingTime / processCount);
            System.out.println("Average Turnaround Time: " + (double) totalTurnaroundTime / processCount);
        }

        // Method to display the list of processes
        public void displayProcesses() {
            if (head == null) {
                System.out.println("No processes available.");
                return;
            }

            System.out.println("Processes in the Circular List:");
            Process current = head;
            do {
                System.out.println("Process ID: " + current.processId + ", Burst Time: " + current.burstTime + ", Priority: " + current.priority);
                current = current.next;
            } while (current != head);
        }
}
