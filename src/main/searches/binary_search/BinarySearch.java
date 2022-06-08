package main.searches.binary_search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 7, 8, 9, 11, 12, 17, 20};
        System.out.println(binarySearch(array, 6));
    }

    public static int binarySearch(int[] array, int key) {
        Arrays.sort(array);
        int low = 0;
        int high = array.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            if (array[mid] == key) return mid;
            else if (key < array[mid]) high = mid - 1;
            else if (key > array[mid]) low = mid + 1;

        }
        return -1;
    }

    // бинарный поиск с рекурсией
    public static int binarySearchRecursion(int[] sortArray, int key, int low, int high) {
        int mid = (low + high) / 2;
        if (low >= high) return -1;
        if (key == sortArray[mid]) return mid;
        else if (key < sortArray[mid]) return binarySearchRecursion(sortArray, key, low, mid - 1);
        else return binarySearchRecursion(sortArray, key, mid + 1, high);
    }
}
