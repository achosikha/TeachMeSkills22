package CC;

import java.util.Scanner;

public class CreditCard {
    /*
Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную
карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке.
Напишите программу, которая создает три объекта класса CreditCard у
которых заданы номер счета и начальная сумма
Тестовый сценарий для проверки:
Положите деньги на первые две карточки и снимите с третьей.
Выведите на экран текущее состояние всех трех карточек.
 */
    private String accountNumber;
    private double balance;

    public CreditCard(String accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // method add money
    public void addMoney(double addSum)
    {
        if (addSum >= 0)
        {
            this.balance += addSum;
        } else {
            System.out.println("You cannot add this sum: " + addSum);
        }
    }

    // method getBalance
    public double getBalance()
    {
        return this.balance;
    }


    // method withdraw
    public void withdraw(double withdrawSum)
    {
        if (withdrawSum <= this.balance)
        {
            this.balance -= withdrawSum;
        } else {
            System.out.println("You cannot withdraw the sum: " + withdrawSum + ". " +
                    "Because you don't have enough money. Your balance is: " + this.balance);
        }
    }

    public String getCreditCardInfo()
    {
        return "Credit Card account number: " + this.accountNumber + "\n" +
                "Credit Card current balance is: " + this.balance + "\n";
    }

    public Scanner cin()
    {
        return new Scanner(System.in);
    }
}
