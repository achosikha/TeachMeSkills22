package HomeWork;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Loops
        // while -> logical condition than body
        // do while -> body logical condition
        // for

        // 'C' -> 10

        System.out.print("Please, enter initial char: ");
        Scanner cout = new Scanner(System.in);
        char symbol = (char) cout.nextInt();

        System.out.println();

        System.out.println("Your chars are: ");
        for (int el = 1; el <= 10; el++, symbol++)
        {
            System.out.print(symbol + "\t");
        }

        for (int nums = 1; nums <= 10; nums++)
        {
            if ((nums %2) == 0)
            {
                System.out.println(nums);
            }
        }
    }
}
