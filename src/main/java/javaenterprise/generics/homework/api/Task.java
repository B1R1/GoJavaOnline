package javaenterprise.generics.homework.api;

public interface Task<T> {

    void execute();

    T getResult();
}
