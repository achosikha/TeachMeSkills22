package PrivateException;

public class Main {
    public static void main(String[] args) {
        try {
            checkPassword("Archil");
        } catch (PasswordException e)
        {
            e.getStackTrace();
        }
    }

    static void checkPassword(String msg) throws PasswordException
    {
        if (msg.equals("Archil"))
        {
            System.out.println("Everything is ALRIGHT....");
        } else {
            throw new PasswordException("Your password is incorrect...");
        }
    }
}
