import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 0
        //findNumber();

        // Task 1
        //createNewArray();

        // Task 2
        //fillRandomNumbers();

        // Task 3
        average();
    }

    // Task 0. Создайте массив целых чисел. Напишете программу, которая выводит
    //сообщение о том, входит ли заданное число в массив или нет. Пусть
    //число для поиска задается с консоли (класс Scanner).
    public static void findNumber()
    {
        int[] numbers = new int[]{1, 10, -1, 100, -2, 100, 13, 100, 1, 5, -1, -1, 100};
        boolean is = false;
        int counter = 0;

        System.out.println("The original array is: " + Arrays.toString(numbers));
        System.out.print("Please enter an integer value: ");
        int value = cin().nextInt();

        for (int el = 0; el < numbers.length; el++)
        {
            if (value == numbers[el])
            {
                is = true;
                counter++;
            }
        }

//        for (int el : numbers)
//        {
//            if (value == el)
//            {
//                is = true;
//            }
//        }

        // If we use binarySearch -> we must sort the array
        // otherwise there will be mistakes

//        Arrays.sort(numbers);
//        System.out.println("Sorted array: " + Arrays.toString(numbers));
//        if (Arrays.binarySearch(numbers, value) >= 0)
//        {
//            System.out.println("There is such number in the array");
//        } else {
//            System.out.println("There is no such number in the array.");
//        }

        System.out.println("Is number in the array? " + is + ". If yes, home many times: " + counter);
    }

    //    1. Создайте массив целых чисел. Удалите все вхождения
//    заданного числа из массива.
//    Пусть число задается с консоли (класс Scanner). Если такого числа нет
//- выведите сообщения об этом.
//    В результате должен быть новый массив без указанного числа.
    public static void createNewArray()
    {
        int[] numbers = new int[]{19, 0, 0, -1, 100, -1, -2, 0, 15, 98, 98, 0, 1};
        int[] copiedArray;

        System.out.println("The original array is: " + Arrays.toString(numbers));
        System.out.print("Please, enter an integer: ");
        int value = cin().nextInt();
        int counter = 0;

        for (int el : numbers)
        {
            if (el == value)
            {
                counter++;
            }
        }

        if (counter == 0)
        {
            copiedArray = new int[numbers.length];
            System.arraycopy(numbers, 0, copiedArray, 0, numbers.length);
            System.out.println("There is no such number in the array.");
            System.out.println("The new array with the same values is: " + Arrays.toString(copiedArray));
        } else {
            copiedArray = new int[numbers.length - counter];

            for (int outer = 0, inner = 0; outer < numbers.length; outer++)
            {
                if (numbers[outer] == value)
                {
                    continue;
                }
                copiedArray[inner] = numbers[outer];
                inner++;
            }

            System.out.println("There is such number in the array.");
            System.out.println("The new array is: " + Arrays.toString(copiedArray));
        }
    }

    //2. Создайте и заполните массив случайным числами и выведете
//    максимальное, минимальное и среднее значение.
//    Для генерации случайного числа используйте метод Math.random().
//    Пусть будет возможность создавать массив произвольного
//    размера. Пусть размер массива вводится с консоли.
    public static void fillRandomNumbers()
    {
        System.out.print("Please, enter an array length: ");
        int[] numbers = new int[cin().nextInt()];

        Random random = new Random();
//        Random random1 = new Random(100);

//        for (int el = 0; el < numbers.length; el++)
//        {
//            numbers[el] = random.nextInt(1, 11); // от 1 по 10
//        }
//
//        System.out.println(Arrays.toString(numbers));

        double min; // min > max, max = min, min = max -> temprorary var
        double max;
        double avr; // sum all elements / length

        for (int el = 0; el < numbers.length; el++)
        {
            //numbers[el] = (int) (Math.random() * 10); // return double
            // 0.999999 * 10 = 9.9999 -> 9
            // 0.94 * 10 = 9.4 -> 9
            numbers[el] = (int) Math.round(Math.random() * 10);

            // (Math.random() * по) + мин
        }

        System.out.println(Arrays.toString(numbers));
    }

    public static void average()
    {
        int[] numbers = new int[] {10, 19, 0, 10, 90};
        int[] numbers1 = new int[] {100, -10, 1, 10, 90};

        int sum = 0;
        int sum1 = 0;

        for (int el : numbers)
        {
            sum += el;
        }

        for (int el : numbers1)
        {
            sum1 += el;
        }

        double avr = sum / numbers.length;
        double avr2 = sum1 / numbers1.length;

        if (avr > avr2)
        {
            System.out.println("The first array is bigger: " + avr);
        } else if (avr < avr2)
        {
            System.out.println("The second array is bigger: " + avr2);
        } else {
            System.out.println("Average of both arrays is equal...");
        }
    }

    public static Scanner cin()
    {
        return new Scanner(System.in);
    }


//            3. Создайте 2 массива из 5 чисел.
//    Выведите массивы на консоль в двух отдельных строках.
//    Посчитайте среднее арифметическое элементов каждого массива и
//    сообщите, для какого из массивов это значение оказалось больше (либо
//    сообщите, что их средние арифметические равны).
}
