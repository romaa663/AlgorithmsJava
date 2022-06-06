package main.sorts.selection_sort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] ints = new int[4];

        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(ints));

        selectionSortToMax(ints);
        System.out.println("Выполнена сортировка выбором по возрастанию: " + Arrays.toString(ints));
        selectionSortToMin(ints);
        System.out.println("Выполнена сортировка выбором по убыванию:    " + Arrays.toString(ints));

    }

    public static void selectionSortToMax(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    minIndex = j;
                    min = array[j];
                }
            }
            array[minIndex] = array[i];
            array[i] = min;
        }
    }

    public static void selectionSortToMin(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int maxIndex = i;
            int max = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    maxIndex = j;
                    max = array[j];
                }
            }
            array[maxIndex] = array[i];
            array[i] = max;
        }
    }
}
