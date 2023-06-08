package Varargs;

public class MyMain {
    public static void main(String[] args) {
        // неопределенное количество переменных
        // которые могут передаваться в метод
        // и после передачи в метод идет сохранение данных в виде
        // одномерного массива
        getArguments("Ivan", "Archil", "Daniil", "Irina");
        System.out.println();
        getArguments(12, 100, -1, -98, 1);
        System.out.println("---------------------------------------------------");
        getArguments("JAVA", 'a', 'b', 'c', 'd');
    }

    public static void getArguments(String ... words)
    {
        // одномерный массив
        // String[] words;
        System.out.println("Varargs: ");

        for (String word : words)
        {
            System.out.println(word);
        }
    }

    public static void getArguments (int ... words)
    {
        System.out.println("Varargs: ");

        for (int word : words)
        {
            System.out.println(word);
        }
    }

    // varargs должно быть в конце списка параметров
    public static void getArguments(String name, char ... words)
    {
        for (char el : name.toCharArray())
        {
            System.out.print(el + "--");
        }

        System.out.println();

        for (char el : words)
        {
            System.out.print(el + "--");
        }
    }
}
