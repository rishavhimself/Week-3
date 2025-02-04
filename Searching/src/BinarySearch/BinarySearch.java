package BinarySearch;

public class BinarySearch {
    public static int findRotationPoint(int[] rotatedArray) {
        int front = 0, back = rotatedArray.length - 1;
        while ((front < back)) {
            int mid = (front + back) / 2;
            if (rotatedArray[mid] > rotatedArray[back]) front = mid + 1;
            else back = mid;
        }

        return front;
    }

    public static int findPeak(int[] array) {
        int start = 0, end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] > array[mid - 1] && array[mid] > array[mid + 1]) return mid;
            else if (array[mid] < array[mid - 1]) end = mid - 1;
            else if (array[mid] < array[mid + 1]) start = mid + 1;
        }
        return -1;
    }

    public static boolean searchTargetIn2D(int[][] sortedArray, int key) {
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = 0; j < sortedArray[0].length; j++) {
                if (sortedArray[i][j] == key) return true;
            }
        }
        return false;
    }

    //Method to find First occurrence of a target
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
    //Method to find last occurrence of a target
    public static int findLastOccurrence(int[] array,int target) {
        int first = 0;
        int last = 0;
        int result = -1;
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                result = mid;
                left = mid + 1;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}