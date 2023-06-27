package ExceptionClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Exceptions {
    public static void main(String[] args) throws IOException {
        File text = new File("C:\\Users\\alta\\IdeaProjects\\JavaLearning\\src\\text.txt");
        FileInputStream file = new FileInputStream(text);

        int elements = 0;

        while((elements=file.read())!=-1)
        {
            System.out.print((char)elements);      //prints the content of the file
        }
    }

    static void numbers(int x, int y)
    {
        if (y == 0)
        {
            throw new ArithmeticException("Division on theor");
        }
    }

    static void fileOpen()
    {
        try
        {
            File text = new File("C:\\Users\\alta\\IdeaProjects\\JavaLearning\\src\\text.txt");;
            FileInputStream file =new FileInputStream(text);
        } catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
