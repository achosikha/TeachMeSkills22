package CC;

public class MyMain {
    public static void main(String[] args) {
        CreditCard tbc = new CreditCard("15TBC933058143", 567);
        CreditCard bog = new CreditCard("98BG7461289001", 99);
        CreditCard liberty = new CreditCard("56LB18378901", 1011);

        System.out.println(tbc.getCreditCardInfo());
        System.out.println();
        System.out.println(bog.getCreditCardInfo());
        System.out.println();
        System.out.println(liberty.getCreditCardInfo());

        tbc.addMoney(967);
        bog.addMoney(19);
        liberty.withdraw(54);

        System.out.println();

        System.out.println(tbc.getCreditCardInfo());
        System.out.println();
        System.out.println(bog.getCreditCardInfo());
        System.out.println();
        System.out.println(liberty.getCreditCardInfo());

        System.out.println("-----------------------------------------------------");

        tbc.addMoney(-1000);
        System.out.println("Your balance is: " + tbc.getBalance());
        tbc.withdraw(2000);
    }
}
