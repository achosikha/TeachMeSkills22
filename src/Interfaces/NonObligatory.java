package Interfaces;

// non-classic
public interface NonObligatory {
    // возможность добавлять переменные
    int variable = 10;

    // возможность создавать не абстрактные методы
    // с т.н. default телом
    // you can override if you need
    default void defaultMethod()
    {
        System.out.println("Default Method...");
    }

    // частные методы для работы внутри интерфейса
    private void privateMethod()
    {
        // Внутренние процессы, которые не должны быть доступны другим классам
    }
}
