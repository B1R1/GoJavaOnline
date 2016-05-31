package javaenterprise.generics.homework.realisation;

import javaenterprise.generics.homework.framework.Task;

public class LongTask<Number> implements Task<Long> {
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
