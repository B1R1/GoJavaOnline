package javaenterprise.generics.homework.impl;

import javaenterprise.generics.homework.api.Task;

public class LongTask<Long> implements Task<Long> {

    public LongTask(long value) {
    }

    @Override
    public void execute() {
        System.out.println("Execute");
    }

    @Override
    public Long getResult() {
        return null;
    }
}
