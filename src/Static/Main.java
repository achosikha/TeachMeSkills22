package Static;

public class Main {
    // static variable
    // static method
    // static block
    // inside class
    public static void main(String[] args) {
        Cars bmw = new BMW("BMW", "Black");
        Cars mercedes = new Mercedes("Mercedes", "Red");
        Cars mercedes2 = new Mercedes("Mercedes-2", "Blue");

        System.out.println(bmw);
        System.out.println();
        System.out.println(mercedes);

        System.out.println();

        System.out.println(Cars.getStaticVariable());
        Cars.setStaticVariable("New General meaning...");
        System.out.println(Cars.getStaticVariable());

        System.out.println("**************************************");

        System.out.println(mercedes2.getNumberOfCars());

        System.out.println();
        System.out.println(Cars.getNumberCarsStatic());

        // getRegularMethod(); -> Error

//        static int var1 = 10;

        {
            // block
        }
    }

    static void getStaticMethod()
    {
        // getRegularMethod(); -> Error
    }

    void getRegularMethod()
    {
        getStaticMethod();

        Cars opel = new BMW("Opel", "Grey");
        System.out.println(Cars.getNumberCarsStatic());
    }
}
