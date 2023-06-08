package Inheritance;

public class Wolfs extends Animal{
    public Wolfs(String animalType, String animalName, String animalColor,
                 String animalGender, int age, double weight, double run, double swim, double jump) {
        super(animalType, animalName, animalColor, animalGender, age, weight, run, swim, jump);
    }

    public Wolfs(double jump, double run, double swim)
    {
        super(jump, run, swim);
    }

    @Override
    void jump() {

    }

    @Override
    void roar() {
        System.out.println("My wolf cannot roar. It can sing...");
    }
}
