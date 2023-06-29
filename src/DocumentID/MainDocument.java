package DocumentID;

import java.util.Arrays;

//Основное задание
//        1. Написать программу со следующим функционалом:
//        На вход передать строку (будем считать, что это номер документа).
//        Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
//        - Вывести на экран в одну строку два первых блока по 4 цифры. - Вывести на экран номер документа,
//        но блоки из трех букв заменить на *** (каждая буква заменятся на *).
//        - Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
//        - Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре
//        (реализовать с помощью класса StringBuilder).
//        - Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет
//        (причем, abc и ABC считается одинаковой последовательностью).
//        - Проверить начинается ли номер документа с последовательности 555.
//        - Проверить заканчивается ли номер документа на последовательность 1a2b.
//        Все эти методы реализовать в отдельном классе в статических методах, которые на вход
//        (входным параметром) будут принимать вводимую на вход программы строку.
//        2. Дана произвольная строка.
public class MainDocument {
    public static void main(String[] args) {
        getDocumentID("4567-agf-2874-ErF-3D5R");
    }

    static void getDocumentID(String documentID)
    {
        String[] documentIDSplitted = documentID.split("-");

        System.out.println(Arrays.toString(documentIDSplitted));

        System.out.println("[" + documentIDSplitted[0] + "] - " + "[" + documentIDSplitted[2] + "]");

//        for (int index = 0; index < documentIDSplitted.length; index++)
//        {
//            if (documentIDSplitted[index].length() == 4)
//            {
//                for (int inner = 0; inner < documentIDSplitted[index].length(); inner++)
//                {
//                    if (Character.isLetter(documentIDSplitted[index].charAt(inner)))
//                    {
//                        // if true
//                        // show character
//                    }
//                }
//            }
//        }

        String[] temp = new String[documentIDSplitted.length];
        System.arraycopy(documentIDSplitted, 0, temp, 0, temp.length);

        for (int index = 0; index < documentIDSplitted.length; index++)
        {
            if (documentIDSplitted[index].length() == 3)
            {
                temp[index] = "***";
            }
        }

        System.out.println(Arrays.toString(temp));
    }
}
