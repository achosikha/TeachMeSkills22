package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeDimensionalArray {
    public static void main(String[] args) {
        int[][][] threeDimensionalArray = {
                {
                        {1, 4, 6}
                },
                {
                        {1},
                        {5, 1, 5, 4}
                },
                {
                        {1},
                        {1, 2},
                        {1, 2, 3, 4},
                        {0}
                }
        };

        System.out.println(Arrays.deepToString(threeDimensionalArray));
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter any integer number: ");
        int value = scanner.nextInt();

        for (int[][] outerArray : threeDimensionalArray) {
            for (int[] middleArray : outerArray) {
                for (int i = 0; i < middleArray.length; i++) {
                    middleArray[i] += value;
                }
            }
        }

        System.out.println();
        System.out.println(Arrays.deepToString(threeDimensionalArray));
    }
}