package javaenterprise.generics.realisation;

import javaenterprise.generics.framework.Task;

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
