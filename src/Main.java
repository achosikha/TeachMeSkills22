import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 10;

        // Деление на ноль
//        if (x == 0)
//        {
//            System.out.println("Division by Zero is impossible. X equals 0");
//            System.err.println("Division by Zero is impossible. X equals 0");
//        } else {
//            System.out.println(y / x);
//        }
//
//        System.out.println("You will manage to come to this point...");
//        // Запускаем программу - code 0 -> return 0 = успешной компиляции
//        // > 0 -> программу рухнула, return 1 (Process finished with exit code 1)
//        //checkIfZero();
//
//        System.out.println("---------------------------------------------------------");
        // arrayMistake("Archil", "Ylia", "Vlad", "Irina");

        //generalException();

        localThrowException();
    }

    static void checkIfZero()
    {
        int x = 0;
        int y = 10;

        System.out.println(y / x);
    }

    static void arrayMistake(String ... msg)
    {
        int x = 10;
        int y = 0;

        try {
            // what to try?
            for (int index = 0; index < msg.length; index++)
            {
                System.out.println(msg[index]);
            }

            System.out.println(x / y);

        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("You are out of bounds for the array msg.");
            System.out.println("Your exception message is: " + e.getMessage());
            e.printStackTrace();
        } catch (ArithmeticException e)
        {
            e.printStackTrace();
        }

        System.out.println("!!! After try catch block...");
    }

    static void generalException()
    {
        int x = 0;
        int y = 19;
        try
        {
            int[] num = new int[]{1};

            num[2] = 0;

            System.out.println(y / x);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e)
        {
            e.printStackTrace();
        } catch (Exception e)
        {
            System.out.println("Any mistake can be found...");
            e.printStackTrace();
        }
    }

    static void tryWithResources() throws IOException{
        Scanner scn = new Scanner(Path.of("src/file.txt"));

        try {
            String text = scn.nextLine();
            // used Scanner
            // what to do?
        } catch (Exception e)
        {
            // if broken, what to message
        } finally {
            // in any case, even if try is correct or catch is correct
            scn.close();
        }
    }

    static void localThrowException()
    {
        int x = 0;
        int y = 10;

        if (x == 0)
        {
            throw new ArithmeticException("Division by Zero is IMPOSSIBLE");
        } else {
            System.out.println(y / x);
        }
    }
}
