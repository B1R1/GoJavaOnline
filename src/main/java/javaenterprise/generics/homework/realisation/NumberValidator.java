package javaenterprise.generics.homework.realisation;

import javaenterprise.generics.homework.framework.Validator;

public class NumberValidator<Number> implements Validator<Number> {

    @Override
    public boolean isValid(Number result) {
        return result.toString().length() == 0;
    }
}