package HomeWork;

public class ConditionalOperator {
    public static void main(String[] args) {
        // if
        // else if
        // switch

        boolean isAlive = true;

//        if (isAlive) // by default, if (true), if (!_var)
//        {
//            if (80 > 65)
//            {
//
//            }
//        }

//        if ()
//        {
//
//        } else if ()
//        {
//
//        } else if ()
//        {
//
//        } else {
//
//        }

        String name = "Archil";

        switch (name)
        {
            case "Archil":
                System.out.println("Your name is: " + name);
                break;
            case "Ivan":
            case "Natalya":
            case "Irina":
                System.out.println("You have multiple names...");
                break;
            case "Viktor", "Daniil", "Nikolay":
                System.out.println("Viktor, Daniil, Nikolay");
                return;
            default:
                System.out.println("There is no such name...");
        }

        // break - breaks loop
        // continue - skips iteration
        // return - kills method

        // break & continue - loops, return everywhere
    }
}
