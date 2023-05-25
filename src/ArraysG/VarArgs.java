package ArraysG;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        varArgs("Archil", "Ylia", "Ivan", "Nikita");
        varArgsRegular(10, "Archil", "Aleksandr", "Irina");
    }

    public static void varArgs(String ... names) // String[] -> размер неизвестен
    {
        System.out.println(Arrays.toString(names));
    }

    // Error
//    public static void varArgsError(String ... names, int x)
//    {
//
//    }

    public static void varArgsRegular(int age, String name, String ... other)
    {
        //
    }

    // from to
    // от 0 по 4 (0, 1, 2, 3, 4)
    // from 0 til 4
    // от 0 до 4 (0, 1, 2, 3)
}
