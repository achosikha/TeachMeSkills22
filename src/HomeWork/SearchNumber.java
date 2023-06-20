package HomeWork;

import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
        int[] array = {10, -1, -1, 1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found.");
        } else {
            System.out.println("Not found.");
        }
    }
}
