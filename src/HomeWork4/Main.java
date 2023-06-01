package HomeWork4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(getSumNumbers(number));
    }

    public static void outputNumbers(){
        for (int i = 5; i > 0; i--){
            System.out.print(i + " ");
        }
    }

    public static int getSumNumbers(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static void getOdd(){
        for (int i = 1; i < 100; i++){
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void getSquare() {
        for (int i = 10; i <= 20; i++) {
            System.out.println(i * i);
        }
    }

    public static void getSubsequence() {
        int subsequence = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print(subsequence + " ");
            subsequence -= 5;
        }
    }

    public static void getSubsequence1() {
        int num = 0;
        while (num < 98){
            System.out.print(num += 7);
        }
    }

    public static void showTheSeasonWithIfElse(int month) {

        if (month < 3) {
            System.out.print("It's winter");
        }
        if (month == 3) {
            System.out.print("It's spring");
        }
        if (month == 4) {
            System.out.print("It's spring");
        }
        if (month == 5) {
            System.out.print("It's spring");
        }
        if (month == 6) {
            System.out.print("It's summer");
        }
        if (month == 7) {
            System.out.print("It's summer");
        }
        if (month == 8) {
            System.out.print("It's summer");
        }
        if (month == 9) {
            System.out.print("It's autumn");
        }

        if (month == 10) {
            System.out.print("It's autumn");
        }
        if (month == 11) {
            System.out.print("It's autumn");
        }
        if (month == 12) {
            System.out.print("It's winter");
        } else if (month > 12) {
            System.out.print("There is no such a month of the year");
        }
    }
}
