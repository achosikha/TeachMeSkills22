package HomeWork;

public class Main {
    public static void main(String[] args) {
        getName();

        System.out.println(getText());

        System.out.println(compare(15, 15));

        System.out.println(nestedMethods());

        System.out.println();

        // Я использую один и тот же метод, с разными типами
        // method overload
        getSum(10, 15);
        getSum(15.1, 10);
        getSum(1, 10, 9);
    }

    // verb, method can have echo -> остаток от работы
    public static void getName()
    {
        // void -> пустота
        // примитивные типы и могут классы
        System.out.println("Welcome to my Game...");
    }

    public static String getText()
    {
        String msg = "This is a long message...";

        // return msg; -> l-value
        return "This is a message from C++ r-value style..."; // r-value
    }

    public static String compare (int x, int y)
    {
        // if else
//        if ()
//            else if ()
//                else
        return (x > y) ? "x >" : (x < y) ? "x < " : " x == y";
    }

    public static int nestedMethods()
    {
        return getX() * getY();
    }

    public static int getX()
    {
        return 10;
    }

    public static int getY()
    {
        return 100;
    }

    // method signature, подпись метода
    // имя и передаваемые параметры
    // public static void getNumber(int param1, int param2) -> getNumber(int param1, int param2)
    //
    public static void getSum(int x, int y)
    {
        System.out.println("int: " + x * y);
    }

    public static void getSum(double x, double y)
    {
        System.out.println("double: " + x * y);
    }

    public static void getSum(double x, double y, double z)
    {
        System.out.println(x * y * z);
    }
}
