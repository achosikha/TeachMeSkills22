package FileInputOutput;

import java.io.*;
import java.util.Scanner;

public class MyFileInputOutput {
    public static void main(String[] args) {
        getInputStream();
        getOutputStream();
    }

    static void getInputStream()
    {
        File path = new File("src/FileInputOutput/input.txt");
        int letter;

        // try-with-resources -> автоматический закрывает ресурс, указанный в скобках
        try (FileInputStream input = new FileInputStream(path))
        {
            // System.out.println((char) input.read()); // read()++
            while ((letter = input.read()) != -1) // read()++
            {
                System.out.print((char) letter);
            }

            // readAllBytes() -> doesn't work
//            byte[] allText = input.readAllBytes();
//            System.out.println("\n" + Arrays.toString(allText));

        } catch (FileNotFoundException | SecurityException e)
        {
            e.getStackTrace();
        } catch (IOException e)
        {
            e.getStackTrace();
        }
    }

    static void getOutputStream()
    {
        File path = new File("src/FileInputOutput/input.txt");

        try (FileOutputStream output = new FileOutputStream(path))
        {
            ;
            FileInputStream input = new FileInputStream(path);
            int character;

            while((character = input.read()) != -1)
            {
                System.out.print((char) character);
            }

            System.out.print("Please enter a text to save in the document: ");
            Scanner reWriteMsgFromConsole = new Scanner(System.in);
            String msg = reWriteMsgFromConsole.nextLine();

            byte[] text = msg.getBytes();

            output.write(text);
            output.flush();

            input.close();
        } catch (FileNotFoundException e)
        {
            e.getStackTrace();
        } catch (IOException e)
        {
            e.getStackTrace();
        }
    }
}
