package ObjectClone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car bmw = new Car("BMW", "Grey", new String[]{"Wheels", "Windows", "Bumper"});
        Car mercedes = new Car("Mercedes", "Red", new String[]{"Iron", "Wheel", "Some Staff"});

        // opel -> bwm
        Car opel = bmw;

        System.out.println(opel);
        opel.setModel("Opel");
        System.out.println(bmw);

        System.out.println();

        Car honda = new Car(mercedes);

        honda.setModel("Honda");
        System.out.println(mercedes);
        System.out.println(honda);
        System.out.println("Hash Code: " + mercedes.hashCode());
        System.out.println("Hash Code: " + honda.hashCode());

        honda.setSparParts(new String[]{"Honda", "Mercedes..."});
        System.out.println(mercedes);

        Car hb = (Car) mercedes.clone();
        System.out.println(hb);

        String name = "Archil Sikharulidze";

        // hb.hashCode(); -> long (new -> always unique hash code)
        int x = 10;
        Integer y =  30;
        Integer z = 40;

        System.out.println(y.hashCode());
        System.out.println(z.hashCode());
    }
}
