package Delegation;

public class Main {
    public static void main(String[] args) {
        Human irina = new Human("Irina", "Danilova");

        irina.runs();
        irina.jumps();

        System.out.println();

        Archil archil = new Archil("Archil", "Sikharulidze");

        archil.runs();
        archil.jumps();
    }
}
