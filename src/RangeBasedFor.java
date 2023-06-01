import java.util.Arrays;

public class RangeBasedFor
{
    public static void main(String[] args) {
        classicFor();

        System.out.println();

        rangeBasedFor();

        // classical for -> set and show
        // range-based for -> show
        // forEach -> вывести все

    }

    public static void classicFor()
    {
        String[] words = new String[]{"Archil", "Irina", "Ylia", "Kiril"};

        for (int index = 0; index < words.length; index++)
        {
            System.out.print(words[index] + "\t");
        }

        for (int index = 0; index < words.length; index++)
        {
            words[index] = String.valueOf(index); // index (0) - "0", 1 - "1"
        }

        System.out.println();
        System.out.println(Arrays.toString(words));
    }

    public static void rangeBasedFor()
    {
        String[] words = new String[]{"Archil", "Irina", "Ylia", "Kiril"};

        // range-based for
        // Is used only to read array
        // Not to set values
        for (String names : words)
        {
            System.out.print(names + "\t");
        }

        System.out.println();

        // I am trying to set new values
        for (String names: words)
        {
            names = "Archil";
            System.out.print(names + "\t");
        }

        System.out.println();

        System.out.println(Arrays.toString(words));
    }
}