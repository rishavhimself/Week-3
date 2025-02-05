
// Circular Tour Problem
class CircularTour {
    // Function to find the starting petrol pump index
    public static int findStartingPoint(int[] petrol, int[] distance) {
        int start = 0, deficit = 0, surplus = 0;
        int n = petrol.length;

        for (int i = 0; i < n; i++) {
            surplus += petrol[i] - distance[i];
            if (surplus < 0) {
                start = i + 1;
                deficit += surplus;
                surplus = 0;
            }
        }
        return (surplus + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};
        int startPoint = findStartingPoint(petrol, distance);
        if (startPoint != -1) {
            System.out.println("Start at petrol pump index: " + startPoint);
        } else {
            System.out.println("No valid starting point found");
        }
    }
}

