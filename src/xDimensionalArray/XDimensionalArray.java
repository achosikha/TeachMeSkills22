package xDimensionalArray;

import java.util.Arrays;

public class XDimensionalArray {
    public static void main(String[] args) {
        // tripleDimensionalArray();
        fourDimensionalArray();
    }

    public static void tripleDimensionalArray()
    {
        // куб 3D фигура
        int[][][] cubeNumbers = new int[3][][];
        cubeNumbers[0] = new int[2][];
        cubeNumbers[0][1] = new int[10];

        int[][][] cubeOriginal = new int[][][]
                {
                        {
                                {1, 2, 3}
                        },
                        {
                                {4, 5, 6},
                                {7, 8, 9}
                        },
                        {
                                {10, 11, 12, 14},
                                {1},
                                {4, 5}
                        },
                        {
                                {1}
                        }
                };

        System.out.println(Arrays.deepToString(cubeOriginal));

        System.out.println();

        for (int outer = 0; outer < cubeOriginal.length; outer++)
        {
            for (int middle = 0; middle < cubeOriginal[outer].length; middle++)
            {
                for (int inner = 0; inner < cubeOriginal[outer][middle].length; inner++)
                {
                    System.out.print(cubeOriginal[outer][middle][inner] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println();
        // range-based for
        // массив массива
        // массив массив массив - куб
        for (int[][] outer : cubeOriginal)
        {
            for (int[] middle : outer)
            {
                for (int inner : middle)
                {
                    System.out.print(inner + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void fourDimensionalArray()
    {
        // int[][][][] fourDimensionalArray = new int[2][][][]; -> OK
        int[][][][] fourDimensionalArray = new int[][][][]{
                {
                        {
                                {1, 2, 3},
                                {2}
                        },
                        {
                                {1}
                        },
                        {
                                {1, 4, 10}
                        },
                        {
                                {10, -1}
                        }
                },
                {
                        {
                                {1, 2}
                        }
                }
        };

        for (int outer = 0; outer < fourDimensionalArray.length; outer++)
        {
            for (int outMiddle = 0; outMiddle < fourDimensionalArray[outer].length; outMiddle++)
            {
                for (int middle = 0; middle < fourDimensionalArray[outer][outMiddle].length; middle++)
                {
                    for (int inner = 0; inner < fourDimensionalArray[outer][outMiddle][middle].length; inner++)
                    {
                        System.out.print(fourDimensionalArray[outer][outMiddle][middle][inner] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();

        System.out.println();

        for (int[][][] outer : fourDimensionalArray) // int[][][] outer = fourDimensionalArray[][][][]
        {
            for (int[][] outMiddle : outer) // int[][] outMiddle = int[][][] outer
            {
                for (int[] middle : outMiddle) // int[] middle = int[][] outMiddle
                {
                    for (int inner : middle) // int inner = int[] middle
                    {
                        System.out.print(inner + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
