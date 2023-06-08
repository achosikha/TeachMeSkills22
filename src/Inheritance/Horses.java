package Inheritance;

public class Horses extends Animal{
    public Horses(String animalType, String animalName, String animalColor,
                  String animalGender, int age, double weight, double run, double swim, double jump) {
        super(animalType, animalName, animalColor, animalGender, age, weight, run, swim, jump);
    }

    public Horses(double jump, double run, double swim)
    {
        super(jump, run, swim);
        super.setAnimalType("Horse");
        super.setAnimalName("Unknown");
        super.setAnimalColor("Unknown");
        super.setAnimalGender("Unknown");
    }

    @Override
    void jump() {

    }

    @Override
    void roar() {
        System.out.println("My horse cannot roar...");
    }
}
