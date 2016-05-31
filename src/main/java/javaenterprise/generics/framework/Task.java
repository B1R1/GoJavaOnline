package javaenterprise.generics.framework;

public interface Task<Object> {

    void execute();

    Object getResult();
}
