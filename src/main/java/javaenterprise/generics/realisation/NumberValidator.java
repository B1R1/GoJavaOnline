package javaenterprise.generics.realisation;

import javaenterprise.generics.framework.Validator;

public class NumberValidator<Number> implements Validator<Number> {

    @Override
    public boolean isValid(Number result) {
        return result.toString().length() == 0;
    }
}