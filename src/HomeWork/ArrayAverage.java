package HomeWork;

import java.util.Arrays;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] array1 = generateRandomArray(5);
        System.out.println("Array 1: " + Arrays.toString(array1));
        int[] array2 = generateRandomArray(5);
        System.out.println("Array 2: " + Arrays.toString(array2));

        double average1 = calculateAverage(array1);
        double average2 = calculateAverage(array2);

        if (average1 > average2) {
            System.out.println("The first array is larger.");
        } else if (average1 < average2) {
            System.out.println("The second array is larger.");
        } else {
            System.out.println("Average of arrays.");
        }
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    private static double calculateAverage(int[] array) {
        int sum = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = (double) sum / array.length;
        return average;
    }
}