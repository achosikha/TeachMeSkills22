package PC;

public class MyMain {
    public static void main(String[] args) {
        Computer i7PC = new Computer(2000, "i7PC567",
                new HDD("Seagate", 2, "Seagagate 57F"),
                new RAM ("DDR4", 64));

        Computer i9PC = new Computer(4000, "i9PBC978",
                new HDD("Seagate", 4, "Seagagate 65F"),
                new RAM ("DDR5", 64));

        i7PC.getComputerInfo();

        System.out.println();

        i9PC.getComputerInfo();
    }
}
