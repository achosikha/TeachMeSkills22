package String;

public class StringAdditional {
    public static void main(String[] args) {
        splitStringAdditional("This is Java Lecture...");

        System.out.println("---------------------------------------");

        System.out.println(stringBuilderString("Welcome to Java"));

        System.out.println("-----------------------------------------");

        stringBufferString("Archil");
    }

    static void splitStringAdditional(String msg)
    {
        // "\\*", "\\+"
        String[] msgArray = msg.split(" ", 2);

        for (String el : msgArray)
        {
            System.out.print(el + "\t");
        }
    }

    static String stringBuilderString(String msg)
    {
        StringBuilder stringMsg = new StringBuilder(msg);

        stringMsg.reverse();

        stringMsg.append(" . This is reversed version of the string");

        return "Initial msg was: " + msg + ". Now it is: " + stringMsg;
    }

    static void stringBufferString(String msg)
    {
        StringBuffer msgBuffer = new StringBuffer(msg);

        System.out.println(msgBuffer.reverse());
    }
}
