public class Conditional {
    public static void main(String[] args) {
        // 1.
        // 2.
        // 3....
        // method() -> code
        // 4....
        // 5....
        // goto -> передача контроля

        // Conditional Operators
        // if
        // else if
        // switch
        double s = sumX(10, 4);
        double z = sumY(22, 10);

        System.out.println(s > z); // if s > z - true, else -> false

        System.out.println();

        System.out.println(ifGreater(sumX(10, 4), sumY(22, 10)));

        System.out.println();

        // basicIf();

        getSeasonOfTheYear(6);
    }

    public static double sumX(double x, double y)
    {
        return x * y;
    }

    public static double sumY(double x, double y)
    {
        return x * y;
    }

    public static boolean ifGreater(double x, double y)
    {
        return x > y;
    }

    public static void basicIf()
    {
        boolean isAlive = true;

        if (isAlive == true) // if true -> 1, 2; if false -> 2
            System.out.println();
        System.out.println("This is after if...");

        if (10 > 5)
        {
            System.out.println("10 > 5");
            System.out.println("true, true");
        }

        if (10 < 5)
        {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
        }

        // by default, if () -> true
        boolean isMarried = true;

        if (isMarried) // isMarried == true
        {
            System.out.println("Is Married");
        }

        // logical no -> !
        if (!isMarried) // false
        {
            System.out.println("It is false...");
        }

        int age = 34;

        if (age < 35)
        {
            System.out.println("You are still young...");
        }

        if (age > 35)
        {
            System.out.println("You are not adult anymore...");
        }

        if (age == 35)
        {
            System.out.println("You are in the middle...");
        }

        // else if
        if (age < 35)
        {
            System.out.println("Msg 1");
        } else if (age > 35)
        {
            System.out.println("Msg 2");
        } else
        {
            System.out.println("Msg 3");
        }

        System.out.println();

        if (age > 35)
        {
            System.out.println("You are young according to the international standards...");
            System.out.println("Msg...");
        } else {
            System.out.println("You are either young boy or you are precisely 35 years old...");
            System.out.println("Msg...");
        }

        // inserted conditional operators
        if (isMarried)
        {
            if (age > 35)
            {
                System.out.println("It is time...");
            } else if (age < 35)
            {
                System.out.println("Maybe your are too young...");
            } else
            {
                System.out.println("It is time to think about the marriage...");
            }
        } else
        {
            System.out.println("You are not married. Congratulations!");
        }

        // break can be used as a goto
    }

    public static void getSeasonOfTheYear(int month)
    {
//        switch (month)
//        {
//            case 1:
//                System.out.println("This is a Winter");
//                break;
//            case 2:
//                System.out.println("This is a Winter");
//                break;
//            case 3:
//                System.out.println("This is a Spring");
//                break;
//            case 4:
//                System.out.println("This is a Spring");
//                break;
//            case 5:
//                System.out.println("This is a Spring");
//                break;
//            case 6:
//                System.out.println("This is a Summer");
//                break;
//            case 7:
//                System.out.println("This is a Summer");
//                break;
//            case 8:
//                System.out.println("This is a Summer");
//                break;
//            case 9:
//                System.out.println("This is a Autumn");
//                break;
//            case 10:
//                System.out.println("This is a Autumn");
//                break;
//            case 11:
//                System.out.println("This is a Autumn");
//                break;
//            case 12:
//                System.out.println("This is a Winter");
//                break;
//            default:
//                System.out.println("There is no such month in the year...");
//                break;
//        }

        // advanced, least short
        // more advanced
//        switch (month)
//        {
//            case 1:
//            case 2:
//            case 12:
//                System.out.println("This is a Winter");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("This is a Spring");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("This is a Summer");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("This is a Autumn");
//                break;
//            default:
//                System.out.println("There is no such month in the year...");
//                break;
//        }

        // more advanced, very short
//        switch (month)
//        {
//            case 1, 2, 12:
//                System.out.println("This is a Winter");
//                break;
//            case 3, 4, 5:
//                System.out.println("This is a Spring");
//                break;
//            case 6, 7, 8:
//                System.out.println("This is a Summer");
//                break;
//            case 9, 10, 11:
//                System.out.println("This is a Autumn");
//                break;
//            default:
//                System.out.println("There is no such month in the year...");
//                break;
//        }

//        switch (month)
//        {
//            case 1, 2, 12:
//                System.out.println("This is a Winter");
//                return;
//            case 3, 4, 5:
//                System.out.println("This is a Spring");
//                return
//            case 6, 7, 8:
//                System.out.println("This is a Summer");
//                return;
//            case 9, 10, 11:
//                System.out.println("This is a Autumn");
//                return;
//            default:
//                System.out.println("There is no such month in the year...");
//                return;
//        }

        System.out.println("Additional...");
    }

    public static void multipleChoice()
    {
        int age = 35;
        boolean isMarried = true;

        // || - or, && - and
        if (age > 35 && isMarried) // true, true
        {
            System.out.println("You are above 35 and you are married...");
        }

        if (age > 35 || isMarried) //true, false - true, true
        {
            System.out.println("You are either 35 above or are you are married...");
        }

        String status = (isMarried) ? "You are married" : "You are not married";

        String ageStatus = (age > 35) ? "Not adult" : (age < 35) ? "You are adult" : "You are precisely 35";
    }
}
