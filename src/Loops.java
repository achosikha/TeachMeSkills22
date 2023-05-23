public class Loops {
    public static void main(String[] args) {
        // while
        // do while
        // for

        int counter = 1;

        // цикл while пока проверяет логическое условие, а потом выполняет
        while(counter <= 10)
        {
            // counter++ -> пока выведи значение переменной, а потом прибавь 1 (1 - 10)
            // ++counter -> пока прибавь единицу, а потом уже выводи (2 - 11)
            System.out.println("While. Counter: " + counter++);
        }

        counter = 1;

        System.out.println();

        // do while хотя бы один раз выполнится, если даже логическое условие неправильное
        do {
            System.out.println("Do While. Counter: " + counter++);
        } while(counter <= 10);

        System.out.println();

        // classical for
        // for (initialization var; logical condition; arithmetic operation)
        for (int count = 1; count <= 10; count++)
        {
            System.out.println("For. Count: " + count);
        }

        // вечный цикл
//        while(true)
//        {
//            System.out.println("Eternal Loop");
//        }
//
//        do{
//            System.out.println();
//        } while (true);

        //for (; ; ) // нет переменной, нет логического условия, нет арифметических операций
        //{
            // Пока не сломан изнутри
        //}

        // break
        // return
        // continue
        System.out.println();

        for (int el = 1; el <= 10; el++)
        {
            if (el == 5)
            {
                break;
            }
            System.out.println("El: " + el);
        }
        System.out.println("Still in the method. Reachable.");

        System.out.println();

        for (int el = 1; el <= 10; el++)
        {
            if (el == 5 || el == 7)
            {
                continue;
            }
            System.out.println("El: " + el);
        }
        System.out.println("Still in the method. Reachable.");

        System.out.println();

        for (int el = 1; el <= 10; el++)
        {
            if (el == 7)
            {
                return;
            }
            System.out.println("El: " + el);
        }

        System.out.println("Still in the method. Reachable.");
        System.out.println("....");

        for (int y = 10, x = 20; y > 20 && x < 10; y++, x+=10)
        {
            // Information
        }
    }
}
