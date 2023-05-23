import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //getPersonalData();
        //getSymbol();
        //getBMI();

        getScanner();
        // Эхо Метода/Метод, Функция с Эхо
    }

    // Task 1. Enter personal data name, surname, age, height, weight
    public static void getPersonalData()
    {
        Scanner cout = new Scanner(System.in);

        System.out.print("Please, enter your name: ");
        String name = cout.nextLine();
        System.out.print("Please, enter your surname: ");
        String surname = cout.nextLine();
        System.out.print("Please, enter your age: ");
        int age = cout.nextInt();
        System.out.print("Please, enter your height: ");
        float height = cout.nextFloat();
        System.out.print("Please, enter your weight: ");
        float weight = cout.nextFloat();

        System.out.println();

        // output
        System.out.println("Your name is: " + name);
        System.out.println("Your surname is: " + surname);
        System.out.println("Your age is: " + age);
        System.out.println("Your height is: " + height);
        System.out.println("Your weight is: " + weight);

        // formatted output
        // форматированный вывод
        System.out.printf("This is my height %d and my weight %f", height, weight);

        // String
        // int age = 3444444444; -> 4 byte 32 byt
        // String age1 = "34"; -> 4 byte 32 byt, '3, '4' (2) -> 4
        // String age3 = "3444444444" -> 2 * 10 = 20 byte -> 160 byt
    }

    // Task 2. get symbol and show its integer value
    public static void getSymbol()
    {
        Scanner cout = new Scanner(System.in);

        // char работал ASCII
        System.out.println("Please enter any symbol or integer: ");
        char symbol = (char) cout.nextInt();
        System.out.println("Your symbols is " + symbol + " and its integer value is " + (int)symbol);

        System.out.println();

        // String "abc" -> char 'a', 'b', 'c' -> a (0), b(1), c(2) -> 0 'a'
//        char symbolFromString = cout.nextLine().charAt(0);
//        System.out.println("Your symbols is " + symbolFromString + " and its integer value is " + (int)symbolFromString);
    }

    // Task 3. get Body Mass Index
    public static void getBMI()
    {
        Scanner cout = new Scanner(System.in);

        System.out.print("PLease, enter your height cm: ");
        double height = cout.nextDouble();
        System.out.print("Please, enter your weight: ");
        double weight = cout.nextDouble();

        // BMI
        // height: 1.72, weight: 80.8
        // 80.8 / (1.72 * 1.72) -> 30.0000
        // 80.8 / (172 * 172) -> 0.000300000
        // weight / (height * height)
        height /= 100;
        double sum = weight / (height * height);
        System.out.println("Your BMI is: " + sum);

        System.out.println(Math.pow(2, 10));
    }

    public static void getScanner()
    {
        // Buffer это уголок памяти в компьютере, где временно хранятся ваши данные
        // Resource
        Scanner cout = new Scanner(System.in);

        System.out.print("Please enter next token: ");
        String nextToken = cout.next(); // get first token возьми все от первого символа по пробел
                                        // все остальное если мы введем, он сохранит в буфере и пробросит
                                        // его в следующий раз
        System.out.print("Please, enter nextLine(): ");
        String nextLine = cout.nextLine();

        System.out.println("What is: " + nextToken);
        System.out.println("What is: " + nextLine);

        // Resource is close only once at the end
        // You must close the resource
        cout.close();
    }
}
