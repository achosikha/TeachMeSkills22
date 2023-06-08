package Inheritance;

public class MyMain {
    public static void main(String[] args) {
        Animal lion = new Lions("Lion", "Henry",
                "Yellow", "Male", 4, 60, 50, 10, 2);

        Animal wolf = new Wolfs("Wolf", "Rita", "Grey",
                "Female", 2, 30, 20, 5, 3);

        Animal horse = new Horses("Horse", "Vasya", "Brown",
                "Male", 2, 120, 200, 2, 3);

//        Animal animal = new Animal("Animal", "Unknown", "Unknown",
//                "Unknown", 0, 0);

        // Lions lions = new Lions(); -> не все фишки супер класса могут быть доступны
        // Объявишь Льва - будешь его опять приводить ко льву через создание супер класса
        // Lions lions = (Lions) new Animal("Lion", "l", "y", "f", 0, 0);

//        lion.getAnimalInfo();
//        System.out.println();
//        wolf.getAnimalInfo();
//        System.out.println();
//        horse.getAnimalInfo();
//        System.out.println();
//        animal.getAnimalInfo();
//        Animal[] zoo = new Animal[]{
//                new Horses("Horse", "Henrietta", "Brown with White",
//                        "Female", 3, 150),
//                new Wolfs("Wolf", "Johnny", "Grey",
//                        "Female", 5, 60),
//                new Lions("Lion", "Vasya", "Yellow",
//                        "Male", 6, 140),
//                new Horses("Horse", "Oleg", "Black",
//                        "Male", 3, 110),
//        };
//
//        for (Animal zooAnimals : zoo)
//        {
//            zooAnimals.getAnimalInfo();
//            System.out.println();
//        }
//
//        System.out.println("---------------------------------------------------------------");

//        zoo[0].jump();
//        zoo[1].run();
//        zoo[2].swim();

//        Animal oldHorse = new Horses(1, 2, 0);
//
//        oldHorse.swim();
//        oldHorse.jump();
//        oldHorse.run();

        lion.roar();
        horse.roar();
        wolf.roar();

        System.out.println();

        if (lion.getJump() > horse.getJump())
        {
            System.out.println("Lion can jump higher");
        } else {
            System.out.println("Horse can jump higher...");
        }
    }
}
