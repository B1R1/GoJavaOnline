package javaenterprise.generics.homework.impl;

import javaenterprise.generics.homework.api.Validator;

public class NumberValidator<Number> implements Validator<Number> {

    @Override
    public boolean isValid(Number result) {
        return result.toString().length() == 0;
    }
}