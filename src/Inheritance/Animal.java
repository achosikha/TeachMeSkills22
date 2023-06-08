package Inheritance;

// abstract -> Я не могу создать себя из самого себя
// я могу только передать свой данные дочерним классам
public abstract class Animal {
    private String animalType;
    private String animalName;
    private String animalColor;
    private String animalGender;
    private int age;
    private double weight;
    private double jump;
    private double run;
    private double swim;
    String defaultValue; // Так нельзя делать

    public Animal(String animalType, String animalName, String animalColor,
                  String animalGender, int age, double weight, double run, double swim, double jump)
    {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalColor = animalColor;
        this.animalGender = animalGender;
        this.age = age;
        this.weight = weight;
        this.jump = jump;
        this.swim = swim;
        this.run = run;
    }

    public Animal(double jump, double run, double swim)
    {
        this.jump = jump;
        this.run = run;
        this.swim = swim;
    }

    public String getAnimalType() {
        return animalType;
    }

    abstract void jump();

    public void run()
    {
        if (this.run == 0)
        {
            System.out.println("Your horse is too old. It can't run...");
        } else {
            System.out.println("My " + this.animalType + " can run...");
        }
    }

    public void swim()
    {
        if (this.swim == 0)
        {
            System.out.println("Your horse is too old. It can't swim...");
        } else {
            System.out.println("My " + this.animalType + " can swim...");
        }
    }

    abstract void roar(); // абстрактный класс не имеет реализацию абстрактного метода
    // и пусть дочерние классы сами решают вопрос этого метода

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }

    public void setAnimalGender(String animalGender) {
        this.animalGender = animalGender;
    }

    public void getAnimalInfo()
    {
        System.out.println("Animal type: " + this.animalType);
        System.out.println("Animal name: " + this.animalName);
        System.out.println("Animal color: " + this.animalColor);
        System.out.println("Animal gender: " + this.animalGender);
        System.out.println("Animal age: " + this.age);
        System.out.println("Animal weight: " + this.weight);
    }

    public double getJump() {
        return jump;
    }

    public double getRun() {
        return run;
    }

    public double getSwim() {
        return swim;
    }
}
