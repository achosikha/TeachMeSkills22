package Inheritance;

// Inheritance with keyword - extends _which_class
public class Lions extends Animal {
    public Lions(String animalType, String animalName, String animalColor,
                 String animalGender, int age, double weight, double run, double swim, double jump)
    {
        // Пока должен вызвать конструктор супер класса, а потом уже дополнительные действия
        super(animalType, animalName, animalColor, animalGender, age, weight, run, swim, jump);
        // super.defaultValue = "Default value"; -> It is possible
        // System.out.println("Object: " + super.getAnimalType()); -> It is possible
    }

    public Lions(double jump, double run, double swim)
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
        System.out.println("My lion can roar!");
    }
}
