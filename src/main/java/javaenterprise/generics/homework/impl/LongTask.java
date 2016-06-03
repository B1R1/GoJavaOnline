package javaenterprise.generics.homework.impl;

import javaenterprise.generics.homework.api.Task;

public class LongTask<Number> implements Task<Number> {

    public LongTask(long value) {
    }

    @Override
    public void execute() {
        System.out.println("Execute");
    }

    @Override
    public Number getResult() {
        return null;
    }
}
