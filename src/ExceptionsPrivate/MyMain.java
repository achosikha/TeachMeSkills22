package ExceptionsPrivate;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        // Password
        // Password is incorrect -> IncorrectPasswordException

        try {
            checkPassword("achosikha", "Archil");
        } catch (IncorrectPasswordException e)
        {
            e.getStackTrace();
        }
    }

    static void checkPassword(String username, String password) throws IncorrectPasswordException
    {

        Scanner enteredPassword = new Scanner(System.in);

        System.out.print("Please enter your username to proceed: ");
        String myUserName = enteredPassword.nextLine();

        System.out.print("Please enter a password to proceed: ");
        String myPassword = enteredPassword.nextLine();

        if (myUserName.equalsIgnoreCase(username) && !myPassword.equals(password))
        {
            throw new IncorrectPasswordException("You have entered wrong password...");
        } else {
            System.out.println("Your password is correct...");
        }
    }
}
