import java.util.Scanner;

// Class is an Object
// Имя Существительное
// Ключевое слово (keywords)
// Upper-Camel Case - принцип написания класса
// class Human, class LocalZoo
public class JavaBasics {
    // Shortcut: psvm
    // Если функция является частью класса (объекта) называется методом
    // Если метод не в классе, то это функция
    // method - это действие, это глагол
    // lower-camel case
    // setData (первое слово обязательно глагол и пишется в маленьком регистре
    // существительное и начинается с большой буквы
    // setLocalData
    public static void main(String[] args) { // entry point
        // Assembler - самый низкоуровневый читаемый
        // Functional (функциональное программирование)
        // Procedural (процедурное программирование)

        // Pascal - обучить (функциональное программирование)
        // С самый популярный под функциональное программирование
        // Функция - это глагол, указывающий на действие

        // ООП - Объект
        // С++ - С with Extension -> ООП
        // Java - это только ООП + кое-какие возможности функционального программирования
        // Java - все объект

        // functional/method call
        getMessageFromKeyBoard();
    }

    // one action per method
    public static void welcomingMessage()
    {
        System.out.println("Welcome to Java...");
        System.out.println("This is my first step toward functional/method programming...");
        System.out.println("Method is OVER!");
    }

    public static void setStatus()
    {
        System.out.println("You have WON! It was a pleasure to play with you! Bye!");
    }

    public static void getDataTypes()
    {
        System.out.println();

        // Strict Type Java
        System.out.println("How old are you? ");
        System.out.println("My age is 5");

        // Тип переменной обуславливает его значение
        // Если у меня тип переменной Integer -> значение, должно быть целым
        // Если у меня Decimal/Floating -> значение таким
        // Язык строгой типизации
        int age = 34; // int -> целое число, то и вкладывать в него я могу только целые числа

        String name = "Archil"; // String -> значение должно быть обязательно String
        // name -> 000xf4 -> Archil
        // name = Sikharulidze -> "Sikharulidze" -> 0000xfs -> name

        // Имена переменных тоже строго подчиняются правилам: lower-camel case
        int weight;
        int height;

        // Data Types
        // RAM (Randomly Accessed Memory) - краткосрочная память (постоянно работает, заполняется и очищается)
        // HDD, SSD - долгосрочная память

        // Переменная это ячейка памяти в RAM, где мы можем задать значения и эти значения оттуда брать
        // Keywords (ключевые слова)

        System.out.println();

        // Примитивные целочисленные переменные
        byte myByte;
        myByte = 126;
        System.out.println("myByte: " + myByte);

        short myShort = 32_000;
        System.out.println("myShort: " + myShort);

        int myInt = 2_000_000_000;
        System.out.println("myInt: " + myInt);

        long myLong = 34_000_000_000_000L; // L - long
        System.out.println("myLong: " + myLong);


        // Примитивный тип символ (под копотом, int)
        // ASCII Latin
        // Java UTF-16 -> все возможные языки
        char myChar = 'R'; // 'R' - воспринимает его, как численное представление символа R
        System.out.println("myChar: " + myChar);
        System.out.println("myChar: " + (int) myChar);

        char myCharLow = 'r';
        System.out.println("myCharLow: " + myCharLow);
        System.out.println("myCharLow: " + (int) myCharLow);

        // Примитивные переменные с плавящей запятой
        // Статическое значение
        float myFloat = 34.5444F; // myFloat -> явно float
        System.out.println("myFloat: " + myFloat);

        // Используем когда нужна точность, большие числа и операции
        double myDouble = 34.54567890129384;
        System.out.println("myDouble: " + myDouble);

        // Примитивная переменная логическая
        boolean myBoolean = false; // true -> правда или ложь
        // 0 -> false, n > 0 -> true
        // System.out.println("myBoolean: " + (int) myBoolean);

        myBoolean = true;

        // Ссылочный тип переменной - строка
        String myString = "Archil Sikharulidze" + " is an IT Developer" + ". Goodbye!"; // class -> это ссылочный тип
        System.out.println("myString: " + myString);

        // String is immutable
        // Каждый, когда я меняю значение строчки, создается новая переменная с новой ячекой памяти
        myString = "New Meaning!";

        System.out.println("myString: " + myString);

        int var = 4; // 4 byte, 32 b
        // String -> 'A' 'r' 'c' 'h' 'i' 'l' -> 2 * 6

        // Ссылочный тип данных хранится по-другому, нежели примитивные

        // Неявное приведение типа
        float x = 14;
        float y = 15;
        System.out.println(x * y); // double

        // byte -> int
        // int -> long
        // float -> double
        byte bb = 15;
        int intB = bb;
        int rand = 2_000_000_000;
        long randLong = rand;
        float ff = 234.5F;
        double df = ff;

        // Явное приведение типа - Cast
        short shortA = 300;
        byte bShort = (byte) shortA;
        System.out.println(bShort);

        long lInt = 3_000_000_000L;
        int iL = (int) lInt;
        System.out.println(iL);

        double wWeight = 70.6;
        int iWeight = (int) wWeight;
        System.out.println(iWeight);
    }

    public static void operators()
    {
        // Arithmetic
        // Conditional
        // Logical

        double x = 10.5;
        double y = 12.4;
        double sum = x * y;

        System.out.println(sum);

        System.out.println("\n" + (10.5 * 123.4));
        System.out.println(5 + 10 * 3);
        System.out.println((5 + 10) * 3);

        double division = 12;
        double sumDv = division / 4;

        // +
        // -
        // % modus
        System.out.println(10 % 3);

        // 5 % 10 -> первая операнда
        System.out.println(5 % 10);

        // Division by Zero is prohibited
        System.out.println(0 / 10);
        // System.out.println(10 / 0); // Error

        System.out.println(5 * 10 / 9 + (10 * 5) % 10 + 5);

        // Conditional Operators
        // n > x, n < y, n == y, n != x, n >= x, n <= x
        // Logical Operators
        // && -> и, || -> или, ! -> логическое "не"
        // () ? _var : _var2

        System.out.println((10 < 5) ? "TRUE" : "FALSE");

        // instanceof -> только с ссылочными типами
        String name = "Archil";

        // name является ли экземпляром класса String, name создан на базе String
        System.out.println(name instanceof String);
    }

    public static void getMessageFromKeyBoard()
    {
        // Standard input class - Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter some message: ");
        String message = scanner.nextLine(); // Вся строчка

        System.out.print("Please, enter an year: ");
        int year = scanner.nextInt(); // Все число

        System.out.print("Please, enter a decimal number: ");
        double carWeight = scanner.nextDouble();

        System.out.print("Please, enter an integer meaning of the symbol: ");
        char symbol = (char) scanner.nextInt();

        System.out.println("Your message is: " + message);
        System.out.println("You have entered the following year: " + year);
        System.out.println("You have entered car weight: " + carWeight);
        System.out.println("You have entered a number -> " + (int) symbol + " and this is a symbol: " + symbol);

        //
        System.out.println(5 + "5" + 5 + 5);
        System.out.println(5 + "5" + (5 + 5));
    }
}