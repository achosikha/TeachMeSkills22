package HomeWorkInterface;

public class Main {
    public static void main(String[] args) {
        Employee archil = new Accountant("Archil Sikharulidze", "Accountant", "TeachMeSkills");
        Employee irina = new Director("Irina", "Director", "Apple");

        archil.position();
        System.out.println();
        irina.position();

        System.out.println();
        archil.getGeneralInfo();
        irina.getGeneralInfo();
    }
}
