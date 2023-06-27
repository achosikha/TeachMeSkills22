package PrivateException;

public class PasswordException extends Exception{
    public PasswordException(String msg)
    {
        super(msg);
        System.out.println(msg);
    }
}
