package javaenterprise.generics.homework.api;

public interface Validator<Object> {

    boolean isValid(Object result);
}