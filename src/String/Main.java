package String;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String name = new String("Archil");
        String name1 = "Archil";
        String name4 = "Archil"; // name4 -> address name1 -> "Archil" in String Pool

        // String immutable
        String part = "chil";
        String part2 = "Arc";

        String name2 = "Ar" + part;
        String name3 = part2 + "hil";

        System.out.println(name + " has a hashcode: " + name.hashCode());
        System.out.println(name1 + " has a hashcode: " + name1.hashCode());
        System.out.println(name2 + " has a hashcode: " + name2.hashCode());
        System.out.println(name3 + " has a hashcode: " + name3.hashCode());

        System.out.println();
        // 45689282373 -> String
        // String ->
        // == -> сравнение ссылок, а не значений
        System.out.println("name1 == name4: " + (name1 == name4));
        System.out.println("name == name1: " + (name == name1));
        System.out.println("name.equals(name1): " + name.equals(name1));

        final int x = 10; // immutable

        String surname = "Sikharulidze"; // 0x5fgR
        surname = "Budnik"; // surname -> Sikharulidze == surname -> Budnik

        System.out.println("name1 == name2: " + (name1 == name2));
        System.out.println("name2 == name3: " + (name2 == name3));

        System.out.println("Archil" + 3 + 3 * 3 + 3);
        System.out.println(3 + "3" + "Archil");

        System.out.println("-----------------------------------------------------");

        System.out.println();

        String fullName = "Archil Sikharulidze";

        // String -> проитись, как по массиву символов toCharArray()
        // превращает строку в массив символов
        for (char symbol: fullName.toCharArray())
        {
            System.out.print(symbol + "\t");
        }

        // charAt(_char_index) -> from 0 zero string.length-1
        System.out.println("\n" + fullName.charAt(9));
        // fullName.charAt(10) = 'A';

        String toCharSymbols = "Welcome to Java";
        char[] fromStringToChar = toCharSymbols.toCharArray();

        System.out.println(Arrays.toString(fromStringToChar));

        String fromCharToString = Arrays.toString(fromStringToChar);
        System.out.println(fromCharToString);

        // string.equals(_string) = compares two string lexicographically
        System.out.println("Archil".equals("Archil")); // register sensitive
        System.out.println("Archil".equals("archil")); // false A == a

        // toLowerCase, toUpperCase
        System.out.println("ARCHIL".toLowerCase());
        System.out.println("arRHIiil".toUpperCase());

        String lowerCaseStatement = "this is a teachmeskills java profession lecture by archil sikharulidze";
        lowerCaseStatement.toUpperCase();
        System.out.println(lowerCaseStatement);
        String changedString = lowerCaseStatement.toUpperCase();
        System.out.println(changedString);

        // register free comparison - equalsIgnoreCase
        System.out.println("SisrSkrj".equalsIgnoreCase("sISRSkrj"));

        // авторизации недопустимо
        // E-mail: YANhj@MAIL.RU == yanj@mail.ru

        String compareToOne = "A";
        String compareToTwo = "a";

        // 0 - equals, > 0 var1 > va2, < 0 (-1 ...) var1 < var2
        System.out.println(compareToOne.compareTo(compareToTwo));

        String conc = " Sikharulidze";
        String concatedString = "Archil".concat(conc + " Welcome");
        System.out.println(concatedString);

        System.out.println("Archil".contains("r ch")); // проверяем часть строки, а не полностью

        // .length
        System.out.println("Archil Sikharulidze contains: " + "Archil Sikharulidze".length() + " symbols.");
        System.out.println("archil".indexOf("c"));

        String expression = "456*10*5";

        String[] forExpression = expression.split("\\*");

        System.out.println();
        System.out.println(Arrays.toString(forExpression));
        System.out.println(forExpression.length);

        double sum = Double.valueOf(forExpression[0]) * Double.valueOf(forExpression[1]);
        sum = sum * Double.valueOf(forExpression[2]);

        System.out.println(sum);
    }
}
