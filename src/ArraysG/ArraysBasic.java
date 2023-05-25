package ArraysG;

public class ArraysBasic {
    public static void main(String[] args) {
        // Arrays
        // Arrays have fixed size
        // If we want to change size we must create the new one
        // and put values there

        // Array is address
        // Массив это ссылочный тип данных

        int[] oneDimensionalArray; // объявление
        oneDimensionalArray = new int[5]; // динамическое выделение памяти

        // from 0 to 4
        // от 0 по 4
        // from 0 to array.size - 1 = 0 to 5 -1 (4)
        // Initialization
        oneDimensionalArray[0] = 14;
        oneDimensionalArray[1] = 19;
        oneDimensionalArray[2] = -100;
        oneDimensionalArray[3] = 101;
        oneDimensionalArray[4] = 2;

        System.out.println("oneDimensionalArray: " + oneDimensionalArray); // address of the first element of the array

        System.out.println(oneDimensionalArray[0]);
        System.out.println(oneDimensionalArray[1]);
        System.out.println(oneDimensionalArray[2]);
        System.out.println(oneDimensionalArray[3]);
        System.out.println(oneDimensionalArray[4]);
        // oneDimensionalArray[5] = 10; -> ArrayIndexOutOfBoundsException

        char[] oneDimensionalCharArray = new char[10]; // indexes from 0 to 9
        System.out.println(oneDimensionalCharArray);
        oneDimensionalCharArray[0] = 'B';
        System.out.println(oneDimensionalCharArray);

        char[] oneDimensionalCharArray2 = new char[]{'A', 'B', 'C'};
        System.out.println(oneDimensionalCharArray2);

        String[] stringArray = new String[10];
        System.out.println(stringArray[0]);

        // объявление, выделение памяти, а размер массива высчитываются через количество параметро
        // String[] array = new String[3];
        // array[0] = "Archil";
        // array[1] = "Irina";
        // array[2] = "Vasily";
        String[] oneDimensionalStringArray = new String[] { "Archil", "Irina", "Vasily" };

        int[] arrayInt = new int[10];

//        System.out.println(arrayInt);
//        System.out.println(arrayInt[0]);

        // JS - never use new
        // Java always use new
        // The same as double[] oneDimensionalDoubleArray = new double[] {12.5, 100, -1.4, 100};
        double[] oneDimensionalDoubleArray = {12.5, 100, -1.4, 100};

        // Fixed size
        // array has a length (size)
        int arrayLength = oneDimensionalDoubleArray.length; // 4
        System.out.println(oneDimensionalDoubleArray[arrayLength - 1]);

        int x = 10; // Stack = 10
        int[] nums = new int[]{1, 2, 3}; // Stack -> address of the first element in heap
                                        // Heap -> 1, 2, 3
    }
}
