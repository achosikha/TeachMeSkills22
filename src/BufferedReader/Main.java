package BufferedReader;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(FileReader file = new FileReader("src/BufferedReader/general.txt"))
        {
            BufferedReader bufferedReader = new BufferedReader(file);
            int character;

            while ((character = bufferedReader.read()) != -1)
            {
                System.out.print((char) character);
            }

            FileWriter fileWrite = new FileWriter("src/BufferedReader/general.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWrite);

            bufferedWriter.newLine(); // "\n"
            bufferedWriter.append("Archil Sikharulidze"); // +
            bufferedWriter.flush(); // сброс буфера
            bufferedWriter.close(); // закрытие ресурса
        } catch (FileNotFoundException e)
        {
            e.getStackTrace();
        } catch (IOException e)
        {
            e.getStackTrace();
        }
    }
}
