package PersonalExceptions;

public class WrongPassword extends Exception {
    public WrongPassword(String msg)
    {
        super(msg);
    }

    @Override
    public String toString() {
        return "This is my Exception";
    }
}
