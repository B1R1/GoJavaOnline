package javaenterprise.generics.homework.api;

public interface Task<Object> {

    void execute();

    Object getResult();
}
