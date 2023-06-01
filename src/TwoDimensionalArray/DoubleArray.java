package TwoDimensionalArray;

import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {
//        char[][] table = getArray();
//
//        System.out.println(Arrays.toString(table));
//        System.out.println(Arrays.deepToString(table));
//
//        System.out.println();
//
//        showTwoDimensionalArray(table);
//
//        System.out.println();

        copyTwoDimensionalArray();
    }

    public static char[][] getArray()
    {
        return new char[][] {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}
        };
    }

    public static void showTwoDimensionalArray(char[][] table)
    {
        // [rows][columns]
        // array.length -> by default length of rows
        for (int outer = 0; outer < table.length; outer++) // table.length -> how many rows
        {
            // between columns
            // table[row].length -> from rows how many columns
            for (int inner = 0; inner < table[outer].length; inner++)
            {
                System.out.print(table[outer][inner] + "\t"); // Escape Sequence -> tabulation
            }
            System.out.println();
        }

        // set with classical for
        int[][] numbers = new int[3][5];

        for (int outer = 0; outer < numbers.length; outer++)
        {
            for (int inner = 0; inner < numbers[outer].length; inner++)
            {
                numbers[outer][inner] = (outer + inner) * 10;
            }
        }

        System.out.println();

        System.out.println(Arrays.deepToString(numbers));

        System.out.println();

        // range-based for
        // two-dimensional array
        for (int[] outer : numbers) // int[] outer = numbers[0];
        {
            for (int el : outer) // int[] outer -> row 1 -> columns
            {
                System.out.print(el + " \t");
            }
            System.out.println();
        }
    }

    public static void copyTwoDimensionalArray()
    {
        int[][] sourceClassic = new int[3][3];
        int[][] destinationClassic = new int[sourceClassic.length][sourceClassic.length];

        for (int outer = 0; outer < sourceClassic.length; outer++)
        {
            for (int inner = 0; inner < sourceClassic.length; inner++)
            {
                destinationClassic[outer][inner] = sourceClassic[outer][inner];
            }
        }

        System.out.println(Arrays.deepToString(destinationClassic));

        // alias
        // int[][] destination = source;

        int[][] source = new int[][]{
                {1},
                {39, 1, 9},
                {100, -1, 101, 4, -9},
                {-19, -20, 200, 14, 5, 7, 9}
        };

        int[][] destination = new int[source.length][];

        for (int rows = 0; rows < source.length; rows++)
        {
            destination[rows] = new int[source[rows].length]; // source[0][?]
        }

        System.out.println();
        System.out.println(Arrays.deepToString(destination));

        for (int outer = 0; outer < source.length; outer++)
        {
            for (int inner = 0; inner < source[outer].length; inner++)
            {
                destination[outer][inner] = source[outer][inner];
            }
        }

        System.out.println();
        System.out.println(Arrays.deepToString(destination));
    }

    public static void basicTwoDimensionalArray()
    {
        // the list
        int[] numbers = new int[]{1, 2, 3, 4};

        // two-dimensional array - matrix, таблица
        // строчки(rows) и столбцы (columns)

        // **********
        // *
        // *****
        int[][] twoDimensionalArray;
        twoDimensionalArray = new int[3][];
        twoDimensionalArray[0] = new int [10];
        twoDimensionalArray[1] = new int[1];
        twoDimensionalArray[2] = new int [5];

        // int[][] twoDimensionalArray1 = new int[2][2]{{1, 2}, {1, 2}}; -> ERROR
        int[][] twoDimensionalArray1 = new int[2][2];
        twoDimensionalArray1[0][0] = 10;

        int[][] twoDimensionalArray2 = new int[3][];
        twoDimensionalArray2[0] = new int[(int) Math.random() * 10];

        int[][] twoDimensionalArray3 = new int[][]{
                {1, 2, 3}, // строчка, или ряд
                {4, 5, 6, 7},
                {8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18}
        };
    }
}
