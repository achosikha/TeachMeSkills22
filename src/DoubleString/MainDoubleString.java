package DoubleString;

//        Вывести на консоль новую строку, в которой продублирована каждая буква из начальной строки.
//        Например, "Hello" -> "HHeelllloo".
public class MainDoubleString {
    public static void main(String[] args) {
        regularString("Hello");
        regularString("Sikharulidze");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(stringBuilder("Hello"));
        System.out.println(stringBuilder("Sikharulidze"));
    }

    static void regularString(String msg)
    {
        // Double every letter via regular String
        char[] doubleString = new char[msg.length() * 2];
        int index = 0;

        for (char element : msg.toCharArray())
        {
            doubleString[index++] = element;
            doubleString[index++] = element;
        }

        String newString = String.valueOf(doubleString);

        System.out.println("Old string was: " + msg + ". New string is: " + newString);
    }

    static String stringBuilder (String msg)
    {
        // Just insert letter to StringBuilder
        StringBuilder msgBuilder = new StringBuilder(msg);
        int builderIndex = 1;

        for (int index = 0; index < msg.length(); index++)
        {
            msgBuilder.insert(index + builderIndex, msg.charAt(index));
            builderIndex++;
        }

        return "The old string was: " + msg + ". The new string is: " + msgBuilder;
    }
}
