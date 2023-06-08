package InheritanceFinal;

public class Summer extends Wheel { // extends Wheel, MyMain -> нельзя, множественное наследование в Джаве не поддерживается
    // вместо этого есть множественная имплементация через Интерфейсы
    public Summer(String name, String type) {
        super(name, type);
    }

    // я не могу переопределить метод cannotOverride() класса Wheel, потому что он final
}
