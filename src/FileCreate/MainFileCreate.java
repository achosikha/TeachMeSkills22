package FileCreate;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainFileCreate {
    public static void main(String[] args) {
        createFile();
    }

    static String enterFileName()
    {
        return new Scanner(System.in).nextLine();
    }

    static void createFile()
    {
        System.out.print("Please, enter document name: ");
        String path = "src/FileCreate/" + enterFileName();

        File fileName = new File(path);

        try
        {
            fileName.createNewFile();

            FileWriter write = new FileWriter(fileName);

            System.out.print("Please, write a text to save in the document: ");
            write.write(enterFileName());
            write.flush();
            write.close();
        } catch (IOException e)
        {
            e.getStackTrace();
        }

        System.out.print("Would you like to delete the document?");

        if (enterFileName().equals("y"))
        {
            fileName.delete();
        }
    }
}
