package Homework81;

public class Main {
    public static void main(String[] args) {
        Phone samsung = new Phone(79238378391L, "Samsung", 120);
        Phone iphone = new Phone(99559349586L, "Iphone", 100);
        Phone nokia = new Phone(947103432432L, "Nokia", 140);

        System.out.println(samsung);
        System.out.println();
        System.out.println(iphone);
        System.out.println();
        System.out.println(nokia);

        System.out.println("*******************************************************");

        samsung.receiveCall("Ilya");
        iphone.receiveCall("Nastya");
        nokia.receiveCall("Daniil");

        System.out.println("********************************************************");

        samsung.receiveCall("Kiril", 324324966L);
        iphone.receiveCall("Nicholas", 582059349L);
        nokia.receiveCall("Artiom", 84947695584L);

        System.out.println("********************************************************");

        samsung.sendMessage(3749348L, 9274942L, 92378462L, 26734882L);
    }
}
