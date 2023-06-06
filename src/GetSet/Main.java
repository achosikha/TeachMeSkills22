package GetSet;

public class Main {
    public static void main(String[] args) {
        Human archil = new Human();

        // прямой доступ из одного класса к полям другого класса - очень рлохо
        // archil.name = "Archil";

        System.out.println(archil.getName() + " age is: " + archil.getAge());

        archil.setName("Archil");
        archil.setAge(34);
        archil.setSurname("Sikharulidze");

        System.out.println(archil.getName() + " " + archil.getSurname() + " is " + archil.getAge() + " years old...");
    }
}
