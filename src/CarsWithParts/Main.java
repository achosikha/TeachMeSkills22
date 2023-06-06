package CarsWithParts;

public class Main {
    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes FX900", 2023, "Red", 1980, 500,
                new Engine("GH1000", 700), new Wheels("H50", 4),
                new String[]{"Spare Wheel", "Front Window", "Some Additional Staff"});

        System.out.println(mercedes.getCarInformation());

        System.out.println();

        Car empty = new Car();

        System.out.println(empty.getCarInformation());
    }

    // Escape sequences
//    String text = "\\"; // \
//    String text1 = "\'"; // '
//    String txt2 = "\"";
}
