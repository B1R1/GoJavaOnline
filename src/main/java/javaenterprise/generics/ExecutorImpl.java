package javaenterprise.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExecutorImpl<T> implements Executor<T> {
    List<Task> tasks = new ArrayList<>();
    List<Task> validTasks = new ArrayList<>();
    List<Task> invalidTasks = new ArrayList<>();

    public void test(List<Task<Integer>> intTasks) {
        Executor<Number> numberExecutor = new ExecutorImpl<>();

        for (Task<Integer> intTask : intTasks) {
            numberExecutor.addTask(intTask);
        }
        numberExecutor.addTask(new LongTask(10L), new NumberValidator());

        numberExecutor.execute();

        System.out.println("Valid results:");
        for (Number number : numberExecutor.getValidResults()) {
            System.out.println(number);
        }
        System.out.println("Invalid results:");
        for (Number number : numberExecutor.getInvalidResults()) {
            System.out.println(number);
        }
    }

    @Override
    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public void addTask(Task task, Validator validator) {
        if(validator.isValid(task)) validTasks.add(task);
        else invalidTasks.add(task);
    }

    @Override
    public void execute() {
        for (Task t : tasks) {
            t.execute();
        }
    }

    @Override
    public List getValidResults() {
       List<Task> results = new ArrayList<>();
       Validator v = new NumberValidator<>();
       for (Task t : tasks) {
            if (v.isValid(t)){
                results.add(t);
            }
        }
        return results;
    }

    @Override
    public List getInvalidResults() {
        List<Task> results = new ArrayList<>();
        Validator v = new NumberValidator<>();
        for (Task t : tasks) {
            if (!v.isValid(t)){
                results.add(t);
            }
        }
        return results;
    }
}

    class NumberValidator<Number> implements Validator {

        @Override
        public boolean isValid(Object result) {
            return  result.toString().length() == 0;
        }
    }

    class LongTask<Long> implements Task {

        public LongTask(long l) {
        }

        @Override
        public void execute() {
            System.out.println("Execute");

        }

        @Override
        public Object getResult() {
            return LongTask.this;
        }
    }

