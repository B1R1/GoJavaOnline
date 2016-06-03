package javaenterprise.generics.homework.api;

public interface Validator<T> {

    boolean isValid(T result);
}