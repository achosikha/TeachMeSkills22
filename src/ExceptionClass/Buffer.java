package ExceptionClass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Buffer {
    public static void main(String[] args)
    {
        // Небуферизированный ввод
        // из источника он сразу же становится доступным для вывода
        // а - а в буфер - а в вывод

        // Буфер
        // Временное хранилище информации
        // источник -> буфер (ячейка с информацией) -> выход

        // Буферизированный вывод
        // источник - в буфер - делает доступным для вывода

        // Построчный
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your name: ");
        String fullName = scanner.nextLine();
        System.out.println(fullName);

        // Полный (файловый)
        // Пока не будет сообщения о конце документа, -1
        try
        {
            String textInfo = Files.readAllLines(Path.of("src/text.txt")).toString();
            System.out.println(textInfo);
        } catch (IOException e)
        {
            System.out.println("No such file has been found...");
        }
    }
}
