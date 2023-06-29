package FileReaderWriter;

import java.io.*;
import java.util.Scanner;

public class MainFile {
    public static void main(String[] args) {
        getFileReader();
    }

    static void getFileReader()
    {
        File path = new File("src/FileReaderWriter/read.txt");
        int character;

        try (FileReader readFile = new FileReader(path))
        {
            while ((character = readFile.read()) != -1)
            {
                System.out.print((char) character);
            }

            FileWriter write = new FileWriter(path);

            write.write("Please overwrite message. And then lets append some text...");
            write.append("\n\n");

            System.out.print("\nPlease enter some text to append it: ");
            Scanner appendText = new Scanner(System.in);
            String msg = appendText.nextLine();

            write.append(msg);
            write.flush();
            write.close();
        } catch (FileNotFoundException e)
        {
            e.getStackTrace();
        } catch (IOException e)
        {
            e.getStackTrace();
        }
    }
}
