package ExceptionClass;

public class ExceptionsBasics {
    public static void main(String[] args)
    {
        divideTwoNumbers(10, 0);
        System.out.println();
        getArray(new int[] {1, 2, 3});
        System.out.println();
        throwException(10, 0);
    }

    static void divideTwoNumbers(int x, int y)
    {
        try
        {
            System.out.println("X/Y: " + (x / y));
        } catch (ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("You can't divide on zero");
        } finally {
            System.out.println("This part will always show up...");
        }
    }

    static void getArray(int[] array)
    {
        try
        {
            for (int index = 0; index <= array.length; index++)
            {
                System.out.println(array[index]);
            }
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("You are out of index...");
        } catch (Exception e)
        {
            System.out.println("This is a general exception: " + e);
        }

        try
        {
            for (int index = 0; index <= array.length; index++)
            {
                System.out.println(array[index]);
            }
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e)
        {
            System.out.println("You are out of index...");
        } catch (Exception e)
        {
            System.out.println("This is a general exception: " + e);
        }
    }

    static void throwException(int x, int y)
    {
        if (y == 0)
        {
            throw new ArithmeticException("You are trying to divide on zero...");
        }
    }
}