package Homework81;

//
//Класс Phone.
//        Создайте класс Phone, который содержит переменные number, model и
//        weight.
//        Создайте три экземпляра этого класса.
//        Выведите на консоль значения их переменных.
//        Добавить в класс Phone методы: receiveCall, имеет один параметр – имя
//        звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber –
//        возвращает номер телефона. Вызвать эти методы для каждого из
//        объектов.
//        Добавить конструктор в класс Phone, который принимает на вход три
//        параметра для инициализации переменных класса - number, model и
//        weight.
//        Добавить конструктор, который принимает на вход два параметра для
//        инициализации переменных класса - number, model.
//        Добавить конструктор без параметров.
//        Вызвать из конструктора с тремя параметрами конструктор с двумя.
//        Добавьте перегруженный метод receiveCall, который принимает два
//        параметра - имя звонящего и номер телефона звонящего. Вызвать этот
//        метод.
//        Создать метод sendMessage с аргументами переменной длины. Данный
//        метод принимает на вход номера телефонов, которым будет отправлено
//        сообщение. Метод выводит на консоль номера этих телефонов.
public class Phone {
    private long number;
    private String model;
    private double weight;

    public Phone(long number, String model, double weight)
    {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(long number, String model)
    {
        // Constructor Delegate
        this(number, model, 0);
    }

    public Phone()
    {
        this.model = "Unknown";
    }

    public void receiveCall(String whoIsCalling)
    {
        System.out.println(whoIsCalling + " is calling you on the " + this.model);
    }

    public void receiveCall(String whoIsCalling, long callersNumber)
    {
        System.out.println(whoIsCalling + " is calling you on the " + this.model);
        System.out.println(whoIsCalling + "'s number is: " + callersNumber);
    }

    public void sendMessage(long ... telephoneNumbers) // long[] telephoneNumbers = long [?]
    {
        System.out.println("Messages must be sent to the following numbers:");
        for (int index = 0; index < telephoneNumbers.length; index++)
        {
            System.out.println(telephoneNumbers[index]);
        }
    }

    public long getNumber() {
        return number;
    }

    // Polymorphism
    @Override
    public String toString() {
        return "Phone number is: " + this.number + "\n" + "Phone model: " +
                this.model + "\n" + "Phone weight: " + this.weight;
    }
}
