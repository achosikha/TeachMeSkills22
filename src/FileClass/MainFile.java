package FileClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainFile {
    public static void main(String[] args) {
        File path = new File("src/FileClass/text.txt");

        try {
            Scanner documentScanner = new Scanner(path);
            String firstLine = documentScanner.nextLine();

            System.out.println(firstLine);

            // -1
            while(documentScanner.hasNext())
            {
                System.out.println(documentScanner.nextLine());
            }

            System.out.println("Length of the document in bytes: " + path.length());

            documentScanner.close();
        } catch (FileNotFoundException e)
        {
            e.getStackTrace();
        }
    }
}
