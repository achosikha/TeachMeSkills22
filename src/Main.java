import java.util.Scanner;

// Lesson 4: Conditional Operators, Loops, Continue, Break, Return
// Methods -> Echo, Parameters
public class Main
{
    public static void main(String[] args) {
        int x = 10;
        int y= 20;

        passParameters(x, y, 'A');
        getBMI(1.71, 88.8);

        System.out.println();

        double BMI = returnDoubleValue(1.71, 88.8);
        System.out.println("Your BMI via return is: " + BMI); // -> returnDoubleValue() -> Эхо BMI

        System.out.println();
        System.out.println(getString("Ivan", "Vasilev"));

        {
            int interlaVar = 10; // выделит память
            System.out.println(interlaVar);
            // убьет переменную
        }

//        System.out.print("Age: ");
//        cout().nextInt();
//        System.out.println("Line");
//        cout().nextLine();
    }

    public static void passParameters(int x, int y, char symbol)
    {
    System.out.println("Multiplication: " + (x * y));
    System.out.println("Which symbol you have passed: " + symbol);
    }

    public static void getBMI(double height, double weight)
    {
        System.out.println("Your BMI is: " + (weight / (height * height)));
    }

    // function echo -> остаток
    // void - пустота, никакого остатка, т.е. функция/метод ничего не возвращает
    public static double returnDoubleValue(double height, double weight)
    {
        return weight / (height * height); // return -> вернуться остаток он функции/метода
    }

    public static String getString(String name, String surname)
    {
        return name + " " + surname;
    }

    public static Scanner cout()
    {
        return new Scanner(System.in);
    }
}