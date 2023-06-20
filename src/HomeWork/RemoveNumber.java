package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 2, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }
        }

        if (count > 0) {
            int[] newArray = new int[array.length - count];
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != number) {
                    newArray[index++] = array[i];
                }
            }
            array = newArray;
            System.out.println("Number was deleted.");
            System.out.println(Arrays.toString(newArray));
        } else {
            System.out.println("Number not found.");
        }

        System.out.println("Array: " + Arrays.toString(array));

        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
