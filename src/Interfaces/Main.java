package Interfaces;

public class Main {
    public static void main(String[] args) {
        Employee johnny = new Accountant("Johnny Depp", "Hollywood");
        Employee ember = new Director("Ember Herd", "Hollywood");
        Employee antony = new BlueColorWorker("Antony Mucky", "Hollywood");

        johnny.getPosition();
        System.out.println();
        ember.getPosition();
        System.out.println();
        antony.getPosition();

        System.out.println();
        antony.getAdditionalInfo();

        System.out.println();

        antony.defaultMethod();
        johnny.defaultMethod();
    }
}