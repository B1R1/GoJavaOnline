package javaenterprise.generics;

public interface Task<Object> {
    // Метода запускает таск на выполнение
    void execute();

    // Возвращает результат выполнения
    Object getResult();
}
