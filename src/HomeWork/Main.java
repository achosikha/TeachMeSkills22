package HomeWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreditCard alfabank = new CreditCard("1234567890", 1000.0);

        boolean exit = false;
        while (!exit) {
            System.out.println("Select an operation:");
            System.out.println("1 - Get Credit Card Info");
            System.out.println("2 - Add Money");
            System.out.println("3 - Get Money");
            System.out.println("4 - Get Balance");
            System.out.println("5 - Exit");
            System.out.print("Choose operation: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    alfabank.getCreditCardInfo();
                    break;
                case 2:
                    alfabank.addMoney();
                    break;
                case 3:
                    alfabank.getMoney();
                    break;
                case 4:
                    System.out.println("Balance: " + alfabank.getBalance());
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Error");
            }
            System.out.println();
        }
    }
}