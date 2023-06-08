package PC;

/*
Создать класс для описания компьютера, в этом классе должны быть
поля: стоимость, модель(строковый тип), RAM и HDD.
Для полей RAM и HDD следует создать свои собственные классы.
Классы для RAM и HDD должны иметь конструктор по умолчанию и
конструктор со всеми параметрами.
Класс RAM имеет поля "название" и "объем".
Класс HDD имеет поля "название", "объем" и "тип" (внешний или
внутренний).
Класс Computer должен иметь два конструктора:
- первый - с параметрами стоимость и модель,
- второй - со всеми полями.
При создании объекта "компьютер" с помощью первого конструктора
должны создаваться поля RAM и HDD с помощью конструкторов по
умолчанию.
В каждом из классов предусмотреть методы для вывода полной
информации (вывод всех полей и всех значений).
Тестовый сценарий для проверки:
создать объект "компьютер 1" с помощью первого конструктора и
вывести информацию на экран;
создать объект "компьютер 2" с помощью второго конструктора и
вывести информацию на экран.
 */
public class Computer {
    private double price;
    private String model;
    private HDD hdd;
    private RAM ram;

    public Computer(double price, String model, HDD hdd, RAM ram)
    {
        this.price = price;
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;
    }

    public void getComputerInfo()
    {
        System.out.println("Computer price: " + this.price);
        System.out.println("Computer model: " + this.model);
        System.out.println("Computer " + this.hdd.getHDDInfo());
        System.out.println("Computer " + this.ram.getRAMInfo());
    }
}
