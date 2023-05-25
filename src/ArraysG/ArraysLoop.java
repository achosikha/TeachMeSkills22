package ArraysG;

import java.util.Arrays;
import java.util.Collections;

public class ArraysLoop {
    public static void main(String[] args) {
//        String[] names = new String[] {
//                "Ivan",
//                "Archil",
//                "Ylia",
//                "Vasily",
//                "Irina"
//        };
//
//        showArray(names);
//
//        int[] numbers = setArray();
//
//        System.out.println();
//
//        showArray(numbers);
//
//        System.out.println();
//
//        showArray(charTable());
//
//        System.out.println();

        copyArray();
    }

    public static void showArray(String[] names)
    {
        System.out.println("Your names are: ");
        for(int index = 0; index < names.length; index++)
        {
            System.out.print(names[index] + "\t");
        }
    }

    public static void showArray(int[] names)
    {
        System.out.println("Your numbers are: ");
        for(int index = 0; index < names.length; index++)
        {
            System.out.print(names[index] + "\t");
        }
    }

    public static void showArray(char[] names)
    {
        System.out.println("Your chars are: ");
        for(int index = 0; index < names.length; index++)
        {
            System.out.print(names[index] + "\t");
        }
    }

    public static int[] setArray()
    {
        return new int[]{1, 10, 11};
    }

    public static char[] charTable()
    {
        return new char[] {
                '*', '*', '*', '*'
        };
    }

    public static void setCStyleArray()
    {
        // C-Style Array Declaration
        int nums[] = new int[]{10, -1};
    }

    public static void whileArray()
    {
        int[] ages = new int[10];

        // якорь или флажок
//        int counter = 0;

        // while (counter < 10)
//        while(counter < ages.length) // counter from 0 to 9, counter >= 10 break
//        {
//            ages[counter] = counter + 1;
//            counter++;
//        }
//
//        int[] numbersDoWhile = new int[10];
//
//        counter = 0;
//
//        do {
//            numbersDoWhile[counter] = counter + 4;
//            counter++;
//        } while (counter < numbersDoWhile.length);
//
//        counter = 10;
//
//        while(counter < ages.length)
//        {
//            ages[counter] = counter + 10;
//            ++counter;
//        }
//
//        counter = 0;
//
//        do {
//            ages[counter] = counter + 11;
//        } while (counter < ages.length);

        // for
        for (int index = 0; index < ages.length; index++)
        {
            ages[index] = index + 10;
        }
    }

    public static void getArray()
    {
        double[] numbers = new double[10];

        for (int index = 0; index < numbers.length; index++)
        {
            numbers[index] = index + 11;
        }

        for (int index = 0; index < numbers.length; index++)
        {
            System.out.print(numbers[index] + "\t"); // '\t' -> табуляция в строчку
        }

//        int counter = 0;
//
//        while(counter < numbers.length)
//        {
//            System.out.print(numbers[counter] + "\t");
//            counter++;
//        }
//
//        System.out.println();
//
//        counter = 0;
//
//        do {
//            System.out.print(numbers[counter] + "\t");
//            counter++;
//        } while (counter < numbers.length);
    }

    public static void copyArray()
    {
        int[] nums1 = new int[]{100, 299, 99, -1};
        int[] nums2 = nums1; // nums2 -> nums1

        System.out.println(nums1);
        System.out.println(nums2);
        nums2[0] = -1;
        System.out.println(nums1[0]);

        int[] x = new int[]{100, 299, 99, -1};
        int[] y = new int[x.length];

        for (int index = 0; index < x.length; index++)
        {
            y[index] = x[index];
        }

        // Class
        System.out.println(Arrays.toString(x));

        // Arrays.copyOf();

        // System.arraycopy(куда_вложить, с какой позиции, из_какого массива, с какой позиции, какая окончательная длина);
        // Arrays.sort();
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));

        String[] names = new String[]{"Bold", "Arc", "rTr", "zKl"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        // Arrays.compare();
        // 0 -> массивы равны
        // 1 -> array > array2
        // -1 -> array < array2
        int[] z = new int []{2, 2, 3, 4, 5};
        int[] z1 = new int[]{5,2, 3, 4, 5};

        System.out.println(Arrays.compare(z, z1));

        String[] names1 = new String[]{"Zviad", "Archil", "Leiosha"};
        String[] names2 = new String[]{"Archil", "Zviad", "Leiosha"};

        System.out.println(Arrays.compare(names1, names2));

        // Arrays.binarySearch();
    }
}
