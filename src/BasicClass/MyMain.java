package BasicClass;

public class MyMain
{
    public static void main(String[] args) {
        // Create Cars
        Cars mercedes = new Cars();
        Cars bmw = new Cars();
        Cars opel = new Cars();

        // class.method()
        // class.variable;
        mercedes.getCarInformation();
        System.out.println();
        bmw.getCarInformation();
        System.out.println();
        opel.getCarInformation();

        System.out.println("------------------------------------------------------");

        mercedes.model = "Mercedes GLC50";
        mercedes.productionYear = 2020;
        mercedes.color = "Red";
        mercedes.weight = 2000;
        mercedes.run = 100000;

        // BMW
        bmw.model = "BMW X5";
        bmw.productionYear = 2018;
        bmw.color = "Black";
        bmw.weight = 2200;
        bmw.run = 45900;

        // Opel
        opel.model = "Opel Astra";
        opel.productionYear = 2005;
        opel.color = "Grey";
        opel.weight = 1800;
        opel.run = 200000;

        mercedes.getCarInformation();
        System.out.println();
        bmw.getCarInformation();
        System.out.println();
        opel.getCarInformation();

        System.out.println("\n-----------------------------------------------------------");

        Cars honda = new Cars("Honda FX100", 2017, "White", 2100, 97000);
        System.out.println();
        honda.getCarInformation();

        System.out.println("\n------------------------------------------------------------");

        Cars jeep = new Cars("Jeep X45", "Blue");

        System.out.println();

        jeep.getCarInformation();
        jeep.getThis();

        System.out.println("\n---------------------------------------------------------------");

        Cars ferrari = new Cars("Ferrari X1000", 2023, "Red");

        System.out.println();
        ferrari.getCarInformation();

        System.out.println();
        ferrari.getThis();

        System.out.println("\n-------------------------------------------------------------------");

        Cars lamborgini = new Cars("Lamborgini F9000", 2023, "Green", 1700);

        System.out.println();

        lamborgini.getCarInformation();
    }
}