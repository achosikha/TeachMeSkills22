// Class - object -> Существительным
// Upper-Camel Case
// Class: Human, Zoo, Main, Cartoon
// Class: CreditCard, CheckList
// Class: GeneralLibraryZoo
// .java -> one class per one .java
// keywords -> класс
class Main {
    // Поле класса - переменная уровня класса, значит она не объявлена в классе или же в другом блоке
    // Методы (в Джава принято)/функции класса
    public static void main(String[] args) {
        // Multiparadigm Programming
        // Functional - Procedural
        // Java only OOP -> partial functional programming
        int number = 10; // это переменная уровня метод, локальная переменная, тоже метод

        {
            // скрытие переменной - когда существуют две одинаковые переменные, но разных уровней
            int number1 = 10; // это переменная уровня блок

            // System.gc() -> garbage collector
            // System.gc();
        }
    }

    // Verb -> глагол, lower camel-case
    // getSize
    // set
    // generalize
    // setArraySize

    // Область видимости - где доступна переменная
    // Класс памяти - как долго она будет храниться
}
//
//class General
//{
//    public static void main(String[] args) {
//
//    }
//    void getMethod()
//    {
//
//    }
//}
//
//class Human
//{
//    public static void main(String[] args) {
//
//    }
//    void getGeneralMethod()
//    {
//
//    }
//}