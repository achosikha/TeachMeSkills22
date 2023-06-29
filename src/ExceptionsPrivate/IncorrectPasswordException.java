package ExceptionsPrivate;

public class IncorrectPasswordException extends Exception{
    public IncorrectPasswordException(String msg)
    {
        super(msg);
        System.out.println(msg);
    }
}
