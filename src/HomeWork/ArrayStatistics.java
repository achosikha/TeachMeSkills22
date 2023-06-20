package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(array));

        int max = array[0];
        int min = array[0];
        int sum = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }

            sum += array[i];
        }

        double average = (double) sum / size;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
    }
}
