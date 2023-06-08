package OOP;

public class MyMain {
    public static void main(String[] args) {
        // Encapsulation - Инкапсуляция
        // Inheritance - Наследование
        // Polymorphism - Полиморфизм

        // Инкапсуляция
        // Это скрытие данных
        // Определенные запреты в рамках класса по отношению к другим классам
        // Модификатор доступа -> access modifier

        Car bmw = new Car();

        bmw.defaultName = "Default Value";
        bmw.protectedName = "Protected Value";
        bmw.publicName = "Public Value";
        bmw.getPrivateName(); //
    }
}
